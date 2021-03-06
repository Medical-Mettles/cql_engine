package org.opencds.cqf.cql.engine.fhir.retrieve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.opencds.cqf.cql.engine.fhir.searchparam.SearchParameterMap;
import org.opencds.cqf.cql.engine.fhir.searchparam.SearchParameterResolver;

import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.param.TokenParam;

public class RestFhirRetrieveProvider extends SearchParamFhirRetrieveProvider {

	protected IGenericClient fhirClient;


	public RestFhirRetrieveProvider(SearchParameterResolver searchParameterResolver, IGenericClient fhirClient) {
		super(searchParameterResolver);
		this.fhirClient = fhirClient;
		// TODO: Figure out how to validate that the searchParameterResolver and the context are on the same version of FHIR.
	}

	@Override
	protected Iterable<Object> executeQueries(String dataType, List<SearchParameterMap> queries) {
		if (queries == null || queries.isEmpty()) {
			return Collections.emptyList();
		}
		
		List<Object> objects = new ArrayList<>();
		List<IBaseBundle> bundles = new ArrayList<IBaseBundle>();
		for (SearchParameterMap map : queries) {
			IBaseResource result = this.executeQuery(dataType, map);
			if (result instanceof IBaseBundle) {
				bundles.add((IBaseBundle)result);
			}
			else {
				objects.add(result);
			}
		}

		// TODO: evaluate this lazily in case the engine only needs the first element
		for (IBaseBundle b : bundles) {
			FhirBundleCursor cursor = new FhirBundleCursor(fhirClient, b, dataType);
			cursor.forEach(objects::add);
		}

		return objects;
	}

	protected IBaseResource executeQuery(String dataType, SearchParameterMap map) {
		if (map.containsKey("_id")) {
			return this.queryById(dataType, map);
		}
		else {
			return this.fhirClient.search().byUrl(dataType + map.toNormalizedQueryString(this.fhirClient.getFhirContext())).execute();
		}
	}

	protected IBaseResource queryById(String dataType, SearchParameterMap map) {
		if (map.entrySet().size() > 1) {
			throw new IllegalArgumentException(String.format("Error querying %s. Queries by id must not have any other search criteria.", dataType));
		}

		List<IQueryParameterType> tokenList = map.get("_id").get(0);
		if (tokenList == null || tokenList.isEmpty()) {
			throw new IllegalArgumentException(String.format("Error querying %s. Attempted query by id but no id was specified.", dataType));
		}

		if (tokenList.size() > 1) {
			throw new IllegalArgumentException(String.format("Error querying %s. Attempted query by id but multiple ids were specified.", dataType));
		}

		IQueryParameterType param = tokenList.get(0);
		if (!(param instanceof TokenParam)) {
			throw new IllegalArgumentException(String.format("Error querying %s. Attempted query by id but a non-token parameter was given.", dataType));
		}

		String id = ((TokenParam)param).getValue();

		if (id == null) {
			throw new IllegalArgumentException(String.format("Error querying %s. Attempted query by id but id was null.", dataType));
		}

		return queryById(dataType, id);
	}

	protected IBaseResource queryById(String dataType, String id) {
		return this.fhirClient.read().resource(dataType).withId(id).execute();
	}
}

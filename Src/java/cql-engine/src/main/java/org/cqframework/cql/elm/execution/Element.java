//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import org.apache.commons.lang3.NotImplementedException;
import org.cqframework.cql.execution.Context;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * The Element type defines the abstract base type for all library elements in ELM.
 * 
 * <p>Java class for Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="localId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "annotation"
})
@XmlSeeAlso({
    Library.class,
    TupleElementDefinition.class,
    TypeSpecifier.class,
    ExpressionDef.class,
    ParameterDef.class,
    OperandDef.class,
    CaseItem.class,
    LetClause.class,
    AliasedQuerySource.class,
    SortByItem.class,
    SortClause.class,
    ReturnClause.class,
    CodeSystemDef.class,
    ValueSetDef.class,
    Expression.class,
    UsingDef.class,
    IncludeDef.class
})
public abstract class Element
    extends Executable
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected List<Object> annotation;
    @XmlAttribute(name = "localId")
    protected String localId;

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Object>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    public Element withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    public Element withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    public Element withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Element)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Element that = ((Element) object);
        {
            List<Object> lhsAnnotation;
            lhsAnnotation = (((this.annotation!= null)&&(!this.annotation.isEmpty()))?this.getAnnotation():null);
            List<Object> rhsAnnotation;
            rhsAnnotation = (((that.annotation!= null)&&(!that.annotation.isEmpty()))?that.getAnnotation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotation", lhsAnnotation), LocatorUtils.property(thatLocator, "annotation", rhsAnnotation), lhsAnnotation, rhsAnnotation)) {
                return false;
            }
        }
        {
            String lhsLocalId;
            lhsLocalId = this.getLocalId();
            String rhsLocalId;
            rhsLocalId = that.getLocalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localId", lhsLocalId), LocatorUtils.property(thatLocator, "localId", rhsLocalId), lhsLocalId, rhsLocalId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theAnnotation;
            theAnnotation = (((this.annotation!= null)&&(!this.annotation.isEmpty()))?this.getAnnotation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotation", theAnnotation), currentHashCode, theAnnotation);
        }
        {
            String theLocalId;
            theLocalId = this.getLocalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localId", theLocalId), currentHashCode, theLocalId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Object> theAnnotation;
            theAnnotation = (((this.annotation!= null)&&(!this.annotation.isEmpty()))?this.getAnnotation():null);
            strategy.appendField(locator, this, "annotation", buffer, theAnnotation);
        }
        {
            String theLocalId;
            theLocalId = this.getLocalId();
            strategy.appendField(locator, this, "localId", buffer, theLocalId);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        throw new NotImplementedException("Evaluate not implemented.");
    }
}

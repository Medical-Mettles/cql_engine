package org.opencds.cqf.cql.engine.elm.execution;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.NotImplementedException;
import org.opencds.cqf.cql.engine.debug.DebugAction;
import org.opencds.cqf.cql.engine.exception.CqlException;
import org.opencds.cqf.cql.engine.execution.Context;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class Executable
{
    public Object evaluate(Context context) throws CqlException
    {
        try {
            DebugAction action = context.shouldDebug(this);
            Object result = internalEvaluate(context);
            if (action != DebugAction.NONE) {
                context.logDebugResult(this, result, action);
            }
            return result;
        }
        catch (Exception e) {
            if (e instanceof CqlException) {
                throw e;
            }
            else {
                throw new CqlException(e);
            }
        }
    }

    protected Object internalEvaluate(Context context) {
        throw new NotImplementedException(String.format("evaluate not implemented for class %s",
                this.getClass().getSimpleName()));
    }
}

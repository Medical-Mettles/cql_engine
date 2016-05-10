//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import org.cqframework.cql.execution.Context;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Collection;


/**
 * The SingletonFrom expression extracts a single element from the source list. If the source list is empty, the result is null. If the source list contains one element, that element is returned. If the list contains more than one element, a run-time error is thrown. If the source list is null, the result is null.
 * <p>
 * <p>Java class for SingletonFrom complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SingletonFrom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingletonFrom", namespace = "urn:hl7-org:elm:r1")
public class SingletonFrom
        extends UnaryExpression
        implements Equals, HashCode, ToString {


    @Override
    public SingletonFrom withOperand(Expression value) {
        setOperand(value);
        return this;
    }

    @Override
    public SingletonFrom withAnnotation(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public SingletonFrom withAnnotation(Collection<Object> values) {
        if (values != null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public SingletonFrom withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SingletonFrom)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
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
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        Expression expression = getOperand();
        if (expression == null) return null;

        Object value = expression.evaluate(context);

        if (value == null || value instanceof Iterable == false) {
            return null;
        }

        if (value instanceof java.util.List) {
            if (((java.util.List) value).size() > 1) {
                throw new IllegalArgumentException("The list must contain at least one element in order to use SingletonFrom");
            }

            return ((java.util.List) value).size() == 0 ? null : ((java.util.List) value).get(0);
        } else {
            Object result = null;
            for (Object element : (Iterable) value) {
                if (result == null) {
                    result = element;
                } else {
                    throw new IllegalArgumentException("The list must contain at least one element in order to use SingletonFrom");
                }
            }

            return result;
        }
    }
}

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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Collection;


/**
 * IntervalTypeSpecifier defines an interval type by specifying the point type. Any type can serve as the point type for an interval, so long as it supports comparison operators, minimum and maximum value determination, as well as predecessor and successor functions.
 * 
 * <p>Java class for IntervalTypeSpecifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalTypeSpecifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}TypeSpecifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointType" type="{urn:hl7-org:elm:r1}TypeSpecifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalTypeSpecifier", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "pointType"
})
public class IntervalTypeSpecifier
    extends TypeSpecifier
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected TypeSpecifier pointType;

    /**
     * Gets the value of the pointType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecifier }
     *     
     */
    public TypeSpecifier getPointType() {
        return pointType;
    }

    /**
     * Sets the value of the pointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecifier }
     *     
     */
    public void setPointType(TypeSpecifier value) {
        this.pointType = value;
    }

    public IntervalTypeSpecifier withPointType(TypeSpecifier value) {
        setPointType(value);
        return this;
    }

    @Override
    public IntervalTypeSpecifier withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public IntervalTypeSpecifier withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public IntervalTypeSpecifier withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntervalTypeSpecifier)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IntervalTypeSpecifier that = ((IntervalTypeSpecifier) object);
        {
            TypeSpecifier lhsPointType;
            lhsPointType = this.getPointType();
            TypeSpecifier rhsPointType;
            rhsPointType = that.getPointType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointType", lhsPointType), LocatorUtils.property(thatLocator, "pointType", rhsPointType), lhsPointType, rhsPointType)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TypeSpecifier thePointType;
            thePointType = this.getPointType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointType", thePointType), currentHashCode, thePointType);
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
        super.appendFields(locator, buffer, strategy);
        {
            TypeSpecifier thePointType;
            thePointType = this.getPointType();
            strategy.appendField(locator, this, "pointType", buffer, thePointType);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        throw new NotImplementedException("Evaluate not implemented.");
    }
}

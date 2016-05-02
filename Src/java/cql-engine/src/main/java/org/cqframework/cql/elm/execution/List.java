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
import java.util.ArrayList;
import java.util.Collection;


/**
 * The List selector returns a value of type List, whose elements are the result of evaluating the arguments to the List selector, in order. 
 * 			
 * If a typeSpecifier element is provided, the list is of that type. Otherwise, the static type of the first argument determines the type of the resulting list, and each subsequent argument must be of that same type.
 * 			
 * If any argument is null, the resulting list will have null for that element.
 * 
 * <p>Java class for List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeSpecifier" type="{urn:hl7-org:elm:r1}TypeSpecifier" minOccurs="0"/&gt;
 *         &lt;element name="element" type="{urn:hl7-org:elm:r1}Expression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "typeSpecifier",
    "element"
})
public class List
    extends Expression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected TypeSpecifier typeSpecifier;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected java.util.List<Expression> element;

    /**
     * Gets the value of the typeSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecifier }
     *     
     */
    public TypeSpecifier getTypeSpecifier() {
        return typeSpecifier;
    }

    /**
     * Sets the value of the typeSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecifier }
     *     
     */
    public void setTypeSpecifier(TypeSpecifier value) {
        this.typeSpecifier = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public java.util.List<Expression> getElement() {
        if (element == null) {
            element = new ArrayList<Expression>();
        }
        return this.element;
    }

    public List withTypeSpecifier(TypeSpecifier value) {
        setTypeSpecifier(value);
        return this;
    }

    public List withElement(Expression... values) {
        if (values!= null) {
            for (Expression value: values) {
                getElement().add(value);
            }
        }
        return this;
    }

    public List withElement(Collection<Expression> values) {
        if (values!= null) {
            getElement().addAll(values);
        }
        return this;
    }

    @Override
    public List withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public List withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public List withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof List)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final List that = ((List) object);
        {
            TypeSpecifier lhsTypeSpecifier;
            lhsTypeSpecifier = this.getTypeSpecifier();
            TypeSpecifier rhsTypeSpecifier;
            rhsTypeSpecifier = that.getTypeSpecifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeSpecifier", lhsTypeSpecifier), LocatorUtils.property(thatLocator, "typeSpecifier", rhsTypeSpecifier), lhsTypeSpecifier, rhsTypeSpecifier)) {
                return false;
            }
        }
        {
            java.util.List<Expression> lhsElement;
            lhsElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            java.util.List<Expression> rhsElement;
            rhsElement = (((that.element!= null)&&(!that.element.isEmpty()))?that.getElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement)) {
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
            TypeSpecifier theTypeSpecifier;
            theTypeSpecifier = this.getTypeSpecifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeSpecifier", theTypeSpecifier), currentHashCode, theTypeSpecifier);
        }
        {
            java.util.List<Expression> theElement;
            theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement);
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
            TypeSpecifier theTypeSpecifier;
            theTypeSpecifier = this.getTypeSpecifier();
            strategy.appendField(locator, this, "typeSpecifier", buffer, theTypeSpecifier);
        }
        {
            java.util.List<Expression> theElement;
            theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            strategy.appendField(locator, this, "element", buffer, theElement);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        throw new NotImplementedException("Evaluate not implemented.");
    }
}

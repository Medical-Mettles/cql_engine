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
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.*;


/**
 * The IndexOf operator returns the 0-based index of the given element in the given source list.
 * 
 * The operator uses equivalence semantics as defined in the Equivalent operator to determine the index. The search is linear, and returns the index of the first element for which the equivalence comparison returns true.
 * 
 * If the list is empty, or no element is found, the result is -1.
 * 
 * If either argument is null, the result is null.
 * 
 * <p>Java class for IndexOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *         &lt;element name="element" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexOf", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "source",
    "element"
})
public class IndexOf
    extends Expression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression source;
    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression element;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSource(Expression value) {
        this.source = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setElement(Expression value) {
        this.element = value;
    }

    public IndexOf withSource(Expression value) {
        setSource(value);
        return this;
    }

    public IndexOf withElement(Expression value) {
        setElement(value);
        return this;
    }

    @Override
    public IndexOf withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public IndexOf withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public IndexOf withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IndexOf)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IndexOf that = ((IndexOf) object);
        {
            Expression lhsSource;
            lhsSource = this.getSource();
            Expression rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            Expression lhsElement;
            lhsElement = this.getElement();
            Expression rhsElement;
            rhsElement = that.getElement();
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
            Expression theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            Expression theElement;
            theElement = this.getElement();
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
            Expression theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            Expression theElement;
            theElement = this.getElement();
            strategy.appendField(locator, this, "element", buffer, theElement);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        Object sourceExp = this.getSource();
        Object elementExp = this.getElement();

        if(sourceExp == null || elementExp == null){
            return null;
        }

        Object sourceVal = ((Expression)sourceExp).evaluate(context);
        if(sourceVal == null){
            return null;
        }

        Object elementVal = ((Expression)elementExp).evaluate(context);

        if(sourceVal instanceof Iterable){
            ArrayList sourceList = null;
            if(sourceVal instanceof java.util.List){
                sourceList = new ArrayList((java.util.List)sourceVal);
            }else  {
                sourceList = new ArrayList();
                ((Iterable) sourceVal).forEach(sourceList::add);
            }

            return sourceList.indexOf(elementVal);
        }

        throw new IllegalArgumentException(String.format("Cannot %s arguments of type '%s'.", this.getClass().getSimpleName(), sourceExp.getClass().getName()));
    }
}

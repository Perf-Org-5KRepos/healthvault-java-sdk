//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.CodableValue;
import com.microsoft.healthvault.types.Person;
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:proc="urn:com.microsoft.wc.thing.procedure" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a procedure.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:proc="urn:com.microsoft.wc.thing.procedure" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Note: Please use the new version of this data type instead of this version.
 *                         &lt;br/&gt;
 *                         This thing type describes the procedure results of a person.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="title" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="primary-provider" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="anatomic-location" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="secondary-provider" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "when",
    "title",
    "primaryProvider",
    "anatomicLocation",
    "secondaryProvider"
})
@XmlRootElement(name = "procedure", namespace = "urn:com.microsoft.wc.thing.procedure")
public class Procedure {

    @XmlElement(required = true)
    protected DateTime when;
    protected CodableValue title;
    @XmlElement(name = "primary-provider")
    protected Person primaryProvider;
    @XmlElement(name = "anatomic-location")
    protected CodableValue anatomicLocation;
    @XmlElement(name = "secondary-provider")
    protected Person secondaryProvider;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setTitle(CodableValue value) {
        this.title = value;
    }

    /**
     * Gets the value of the primaryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPrimaryProvider() {
        return primaryProvider;
    }

    /**
     * Sets the value of the primaryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPrimaryProvider(Person value) {
        this.primaryProvider = value;
    }

    /**
     * Gets the value of the anatomicLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getAnatomicLocation() {
        return anatomicLocation;
    }

    /**
     * Sets the value of the anatomicLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setAnatomicLocation(CodableValue value) {
        this.anatomicLocation = value;
    }

    /**
     * Gets the value of the secondaryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getSecondaryProvider() {
        return secondaryProvider;
    }

    /**
     * Sets the value of the secondaryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setSecondaryProvider(Person value) {
        this.secondaryProvider = value;
    }

}

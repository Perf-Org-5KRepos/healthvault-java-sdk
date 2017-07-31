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
import com.microsoft.healthvault.types.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:contraindication="urn:com.microsoft.wc.thing.contraindication" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to an contraindication.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:contraindication="urn:com.microsoft.wc.thing.contraindication" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This thing type is used to store substances (such as food or drugs) that interacts badly with a 
 *                         specific condition or drugs a patient is already taking.
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
 *         &lt;element name="substance" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="status" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="source" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="documenter" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="documented-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
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
    "substance",
    "status",
    "source",
    "documenter",
    "documentedDate"
})
@XmlRootElement(name = "contraindication", namespace = "urn:com.microsoft.wc.thing.contraindication")
public class Contraindication {

    @XmlElement(required = true)
    protected CodableValue substance;
    @XmlElement(required = true)
    protected CodableValue status;
    protected CodableValue source;
    protected Person documenter;
    @XmlElement(name = "documented-date")
    protected ApproxDateTime documentedDate;

    /**
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setSubstance(CodableValue value) {
        this.substance = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setStatus(CodableValue value) {
        this.status = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setSource(CodableValue value) {
        this.source = value;
    }

    /**
     * Gets the value of the documenter property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getDocumenter() {
        return documenter;
    }

    /**
     * Sets the value of the documenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setDocumenter(Person value) {
        this.documenter = value;
    }

    /**
     * Gets the value of the documentedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getDocumentedDate() {
        return documentedDate;
    }

    /**
     * Sets the value of the documentedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setDocumentedDate(ApproxDateTime value) {
        this.documentedDate = value;
    }

}

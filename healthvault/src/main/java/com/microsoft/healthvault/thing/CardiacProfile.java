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
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.cardiac-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A summary of a person's cardiac condition.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.cardiac-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A person's cardiac profile is made up of a set of
 *                         answers to common questions and measurements that indicate the
 *                         cardiac condition of the person.
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
 *         &lt;element name="on-hypertension-diet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="on-hypertension-medication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="renal-failure-diagnosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="diabetes-diagnosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="has-family-heart-disease-history" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="has-family-stroke-history" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="has-personal-heart-disease-history" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="has-person-stroke-history" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "onHypertensionDiet",
    "onHypertensionMedication",
    "renalFailureDiagnosed",
    "diabetesDiagnosed",
    "hasFamilyHeartDiseaseHistory",
    "hasFamilyStrokeHistory",
    "hasPersonalHeartDiseaseHistory",
    "hasPersonStrokeHistory"
})
@XmlRootElement(name = "cardiac-profile", namespace = "urn:com.microsoft.wc.thing.cardiac-profile")
public class CardiacProfile {

    @XmlElement(required = true)
    protected DateTime when;
    @XmlElement(name = "on-hypertension-diet")
    protected Boolean onHypertensionDiet;
    @XmlElement(name = "on-hypertension-medication")
    protected Boolean onHypertensionMedication;
    @XmlElement(name = "renal-failure-diagnosed")
    protected Boolean renalFailureDiagnosed;
    @XmlElement(name = "diabetes-diagnosed")
    protected Boolean diabetesDiagnosed;
    @XmlElement(name = "has-family-heart-disease-history")
    protected Boolean hasFamilyHeartDiseaseHistory;
    @XmlElement(name = "has-family-stroke-history")
    protected Boolean hasFamilyStrokeHistory;
    @XmlElement(name = "has-personal-heart-disease-history")
    protected Boolean hasPersonalHeartDiseaseHistory;
    @XmlElement(name = "has-person-stroke-history")
    protected Boolean hasPersonStrokeHistory;

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
     * Gets the value of the onHypertensionDiet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnHypertensionDiet() {
        return onHypertensionDiet;
    }

    /**
     * Sets the value of the onHypertensionDiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnHypertensionDiet(Boolean value) {
        this.onHypertensionDiet = value;
    }

    /**
     * Gets the value of the onHypertensionMedication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnHypertensionMedication() {
        return onHypertensionMedication;
    }

    /**
     * Sets the value of the onHypertensionMedication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnHypertensionMedication(Boolean value) {
        this.onHypertensionMedication = value;
    }

    /**
     * Gets the value of the renalFailureDiagnosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenalFailureDiagnosed() {
        return renalFailureDiagnosed;
    }

    /**
     * Sets the value of the renalFailureDiagnosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenalFailureDiagnosed(Boolean value) {
        this.renalFailureDiagnosed = value;
    }

    /**
     * Gets the value of the diabetesDiagnosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiabetesDiagnosed() {
        return diabetesDiagnosed;
    }

    /**
     * Sets the value of the diabetesDiagnosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiabetesDiagnosed(Boolean value) {
        this.diabetesDiagnosed = value;
    }

    /**
     * Gets the value of the hasFamilyHeartDiseaseHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFamilyHeartDiseaseHistory() {
        return hasFamilyHeartDiseaseHistory;
    }

    /**
     * Sets the value of the hasFamilyHeartDiseaseHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFamilyHeartDiseaseHistory(Boolean value) {
        this.hasFamilyHeartDiseaseHistory = value;
    }

    /**
     * Gets the value of the hasFamilyStrokeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFamilyStrokeHistory() {
        return hasFamilyStrokeHistory;
    }

    /**
     * Sets the value of the hasFamilyStrokeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFamilyStrokeHistory(Boolean value) {
        this.hasFamilyStrokeHistory = value;
    }

    /**
     * Gets the value of the hasPersonalHeartDiseaseHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPersonalHeartDiseaseHistory() {
        return hasPersonalHeartDiseaseHistory;
    }

    /**
     * Sets the value of the hasPersonalHeartDiseaseHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPersonalHeartDiseaseHistory(Boolean value) {
        this.hasPersonalHeartDiseaseHistory = value;
    }

    /**
     * Gets the value of the hasPersonStrokeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPersonStrokeHistory() {
        return hasPersonStrokeHistory;
    }

    /**
     * Sets the value of the hasPersonStrokeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPersonStrokeHistory(Boolean value) {
        this.hasPersonStrokeHistory = value;
    }

}

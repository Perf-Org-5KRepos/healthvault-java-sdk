//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PersonInfoInternal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfoInternal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="is-newsletter-subscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="security-contact" type="{urn:com.microsoft.wc.person}SecurityContactInfo" minOccurs="0"/>
 *         &lt;element name="is-health-statement-subscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="health-statement-last-sent-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contact-email" type="{urn:com.microsoft.wc.types}EmailAddress" minOccurs="0"/>
 *         &lt;element name="contact-email-validated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contact-validation-token" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="is-eprep-user" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="is-wmgmt-user" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="version-stamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date-created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="person-state" type="{urn:com.microsoft.wc.person}PersonState"/>
 *         &lt;element name="communication-preferences-access-token" type="{urn:com.microsoft.wc.types}stringnz"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfoInternal", namespace = "urn:com.microsoft.wc.person", propOrder = {
    "isNewsletterSubscriber",
    "securityContact",
    "isHealthStatementSubscriber",
    "healthStatementLastSentDate",
    "contactEmail",
    "contactEmailValidated",
    "contactValidationToken",
    "isEprepUser",
    "isWmgmtUser",
    "versionStamp",
    "dateCreated",
    "personState",
    "communicationPreferencesAccessToken"
})
public class PersonInfoInternal {

    @XmlElement(name = "is-newsletter-subscriber")
    protected Boolean isNewsletterSubscriber;
    @XmlElement(name = "security-contact")
    protected SecurityContactInfo securityContact;
    @XmlElement(name = "is-health-statement-subscriber")
    protected Boolean isHealthStatementSubscriber;
    @XmlElement(name = "health-statement-last-sent-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar healthStatementLastSentDate;
    @XmlElement(name = "contact-email")
    protected String contactEmail;
    @XmlElement(name = "contact-email-validated")
    protected Boolean contactEmailValidated;
    @XmlElement(name = "contact-validation-token")
    protected String contactValidationToken;
    @XmlElement(name = "is-eprep-user")
    protected Boolean isEprepUser;
    @XmlElement(name = "is-wmgmt-user")
    protected Boolean isWmgmtUser;
    @XmlElement(name = "version-stamp", required = true)
    protected String versionStamp;
    @XmlElement(name = "date-created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "person-state", required = true)
    @XmlSchemaType(name = "string")
    protected PersonState personState;
    @XmlElement(name = "communication-preferences-access-token", required = true)
    protected String communicationPreferencesAccessToken;

    /**
     * Gets the value of the isNewsletterSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewsletterSubscriber() {
        return isNewsletterSubscriber;
    }

    /**
     * Sets the value of the isNewsletterSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewsletterSubscriber(Boolean value) {
        this.isNewsletterSubscriber = value;
    }

    /**
     * Gets the value of the securityContact property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityContactInfo }
     *     
     */
    public SecurityContactInfo getSecurityContact() {
        return securityContact;
    }

    /**
     * Sets the value of the securityContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityContactInfo }
     *     
     */
    public void setSecurityContact(SecurityContactInfo value) {
        this.securityContact = value;
    }

    /**
     * Gets the value of the isHealthStatementSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHealthStatementSubscriber() {
        return isHealthStatementSubscriber;
    }

    /**
     * Sets the value of the isHealthStatementSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHealthStatementSubscriber(Boolean value) {
        this.isHealthStatementSubscriber = value;
    }

    /**
     * Gets the value of the healthStatementLastSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHealthStatementLastSentDate() {
        return healthStatementLastSentDate;
    }

    /**
     * Sets the value of the healthStatementLastSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHealthStatementLastSentDate(XMLGregorianCalendar value) {
        this.healthStatementLastSentDate = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactEmailValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactEmailValidated() {
        return contactEmailValidated;
    }

    /**
     * Sets the value of the contactEmailValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactEmailValidated(Boolean value) {
        this.contactEmailValidated = value;
    }

    /**
     * Gets the value of the contactValidationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValidationToken() {
        return contactValidationToken;
    }

    /**
     * Sets the value of the contactValidationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValidationToken(String value) {
        this.contactValidationToken = value;
    }

    /**
     * Gets the value of the isEprepUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEprepUser() {
        return isEprepUser;
    }

    /**
     * Sets the value of the isEprepUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEprepUser(Boolean value) {
        this.isEprepUser = value;
    }

    /**
     * Gets the value of the isWmgmtUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWmgmtUser() {
        return isWmgmtUser;
    }

    /**
     * Sets the value of the isWmgmtUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWmgmtUser(Boolean value) {
        this.isWmgmtUser = value;
    }

    /**
     * Gets the value of the versionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionStamp() {
        return versionStamp;
    }

    /**
     * Sets the value of the versionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionStamp(String value) {
        this.versionStamp = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the personState property.
     * 
     * @return
     *     possible object is
     *     {@link PersonState }
     *     
     */
    public PersonState getPersonState() {
        return personState;
    }

    /**
     * Sets the value of the personState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonState }
     *     
     */
    public void setPersonState(PersonState value) {
        this.personState = value;
    }

    /**
     * Gets the value of the communicationPreferencesAccessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationPreferencesAccessToken() {
        return communicationPreferencesAccessToken;
    }

    /**
     * Sets the value of the communicationPreferencesAccessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationPreferencesAccessToken(String value) {
        this.communicationPreferencesAccessToken = value;
    }

}
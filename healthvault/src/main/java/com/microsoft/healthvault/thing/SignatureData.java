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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SignatureData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hv-signature-method" type="{urn:com.microsoft.wc.thing}HealthVaultThingSignatureMethod"/>
 *         &lt;element name="blob-signature-info" type="{urn:com.microsoft.wc.thing}BlobSignatureInfo" minOccurs="0"/>
 *         &lt;element name="algorithm-tag" type="{urn:com.microsoft.wc.types}stringnznw"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureData", namespace = "urn:com.microsoft.wc.thing", propOrder = {
    "hvSignatureMethod",
    "blobSignatureInfo",
    "algorithmTag"
})
public class SignatureData {

    @XmlElement(name = "hv-signature-method", required = true)
    @XmlSchemaType(name = "string")
    protected HealthVaultThingSignatureMethod hvSignatureMethod;
    @XmlElement(name = "blob-signature-info")
    protected BlobSignatureInfo blobSignatureInfo;
    @XmlElement(name = "algorithm-tag", required = true)
    protected String algorithmTag;

    /**
     * Gets the value of the hvSignatureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link HealthVaultThingSignatureMethod }
     *     
     */
    public HealthVaultThingSignatureMethod getHvSignatureMethod() {
        return hvSignatureMethod;
    }

    /**
     * Sets the value of the hvSignatureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthVaultThingSignatureMethod }
     *     
     */
    public void setHvSignatureMethod(HealthVaultThingSignatureMethod value) {
        this.hvSignatureMethod = value;
    }

    /**
     * Gets the value of the blobSignatureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BlobSignatureInfo }
     *     
     */
    public BlobSignatureInfo getBlobSignatureInfo() {
        return blobSignatureInfo;
    }

    /**
     * Sets the value of the blobSignatureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobSignatureInfo }
     *     
     */
    public void setBlobSignatureInfo(BlobSignatureInfo value) {
        this.blobSignatureInfo = value;
    }

    /**
     * Gets the value of the algorithmTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmTag() {
        return algorithmTag;
    }

    /**
     * Sets the value of the algorithmTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmTag(String value) {
        this.algorithmTag = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;CodableValue&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A value that may have codes from one or more Microsoft
 *                     Health vocabularies associated with it.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A codable value represents a value that may reference a
 *                     coded value in one or more of the Microsoft Health
 *                     vocabularies. Though it does not require the value to
 *                     be in a vocabulary.&lt;br/&gt;&lt;br/&gt;
 *                     For example, aerobic session data has a mode element
 *                     of type codable-value. Although many common forms of
 *                     aerobic session mode can be found in the Microsoft
 *                     Health Lexicon using the 'aerobic-activities' vocabulary,
 *                     not all possible activities can be found there. If the
 *                     activity does exist in the vocabulary it is recommended
 *                     that applications add the coded-value for that code as
 *                     a 'code' element and set the 'text' element to the
 *                     display value for that code. If the activity does not
 *                     exist in the vocabulary the 'code' element should not
 *                     be specified and the 'text' element should contain the
 *                     data the user entered.&lt;br/&gt;&lt;br/&gt;
 *                     By using the coded-value when available the data can
 *                     be easily localized by Microsoft HealthVault and
 *                     can also be utilized by applications that are mining the
 *                     data based on certain code values.&lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for codable-value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codable-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{urn:com.microsoft.wc.thing.types}coded-value" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codable-value", namespace = "urn:com.microsoft.wc.thing.types", propOrder = {
    "text",
    "code"
})
public class CodableValue {

    @XmlElement(required = true)
    protected String text;
    protected List<CodedValue> code;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedValue }
     * 
     * 
     */
    public List<CodedValue> getCode() {
        if (code == null) {
            code = new ArrayList<CodedValue>();
        }
        return this.code;
    }

}

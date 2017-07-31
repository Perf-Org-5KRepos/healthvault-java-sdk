//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plan-status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="plan-status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Archived"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Recommended"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "plan-status", namespace = "urn:com.microsoft.wc.thing.plan")
@XmlEnum
public enum PlanStatus {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"&gt;
     *                             User is no longer actively following the plan.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Archived")
    ARCHIVED("Archived"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"&gt;
     *                             User is actively following the plan.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"&gt;
     *                             User has not started following the plan.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"&gt;
     *                             User followed the plan through to completion.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    PlanStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanStatus fromValue(String v) {
        for (PlanStatus c: PlanStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

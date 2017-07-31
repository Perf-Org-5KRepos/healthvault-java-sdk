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
 * <p>Java class for plan-outcome-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="plan-outcome-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StepsPerDay"/>
 *     &lt;enumeration value="CaloriesPerDay"/>
 *     &lt;enumeration value="ExerciseHoursPerWeek"/>
 *     &lt;enumeration value="SleepHoursPerNight"/>
 *     &lt;enumeration value="MinutesToFallAsleepPerNight"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "plan-outcome-type", namespace = "urn:com.microsoft.wc.thing.plan")
@XmlEnum
public enum PlanOutcomeType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StepsPerDay")
    STEPS_PER_DAY("StepsPerDay"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CaloriesPerDay")
    CALORIES_PER_DAY("CaloriesPerDay"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ExerciseHoursPerWeek")
    EXERCISE_HOURS_PER_WEEK("ExerciseHoursPerWeek"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SleepHoursPerNight")
    SLEEP_HOURS_PER_NIGHT("SleepHoursPerNight"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MinutesToFallAsleepPerNight")
    MINUTES_TO_FALL_ASLEEP_PER_NIGHT("MinutesToFallAsleepPerNight"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.plan"/&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PlanOutcomeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanOutcomeType fromValue(String v) {
        for (PlanOutcomeType c: PlanOutcomeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

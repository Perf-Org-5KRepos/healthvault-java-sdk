/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the Action Plan Range Numeric.
 */
public class ActionPlanRangeMetric {
    /**
     * Gets or sets the property name the metric applies to.
     */
    @JsonProperty(value = "propertyName")
    private String propertyName;

    /**
     * Gets or sets the Value Type of the Metric. Possible values include:
     * 'Unknown', 'MinutesToMidnight'.
     */
    @JsonProperty(value = "valueType")
    private String valueType;

    /**
     * Gets or sets the Max value of the target.
     */
    @JsonProperty(value = "maxTarget")
    private Double maxTarget;

    /**
     * Gets or sets the min value of the target.
     */
    @JsonProperty(value = "minTarget")
    private Double minTarget;

    /**
     * Gets or sets the XPath of the property that the metric applies to.
     */
    @JsonProperty(value = "propertyXPath")
    private String propertyXPath;

    /**
     * Get the propertyName value.
     *
     * @return the propertyName value
     */
    public String propertyName() {
        return this.propertyName;
    }

    /**
     * Set the propertyName value.
     *
     * @param propertyName the propertyName value to set
     * @return the ActionPlanRangeMetric object itself.
     */
    public ActionPlanRangeMetric withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * Get the valueType value.
     *
     * @return the valueType value
     */
    public String valueType() {
        return this.valueType;
    }

    /**
     * Set the valueType value.
     *
     * @param valueType the valueType value to set
     * @return the ActionPlanRangeMetric object itself.
     */
    public ActionPlanRangeMetric withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get the maxTarget value.
     *
     * @return the maxTarget value
     */
    public Double maxTarget() {
        return this.maxTarget;
    }

    /**
     * Set the maxTarget value.
     *
     * @param maxTarget the maxTarget value to set
     * @return the ActionPlanRangeMetric object itself.
     */
    public ActionPlanRangeMetric withMaxTarget(Double maxTarget) {
        this.maxTarget = maxTarget;
        return this;
    }

    /**
     * Get the minTarget value.
     *
     * @return the minTarget value
     */
    public Double minTarget() {
        return this.minTarget;
    }

    /**
     * Set the minTarget value.
     *
     * @param minTarget the minTarget value to set
     * @return the ActionPlanRangeMetric object itself.
     */
    public ActionPlanRangeMetric withMinTarget(Double minTarget) {
        this.minTarget = minTarget;
        return this;
    }

    /**
     * Get the propertyXPath value.
     *
     * @return the propertyXPath value
     */
    public String propertyXPath() {
        return this.propertyXPath;
    }

    /**
     * Set the propertyXPath value.
     *
     * @param propertyXPath the propertyXPath value to set
     * @return the ActionPlanRangeMetric object itself.
     */
    public ActionPlanRangeMetric withPropertyXPath(String propertyXPath) {
        this.propertyXPath = propertyXPath;
        return this;
    }

}

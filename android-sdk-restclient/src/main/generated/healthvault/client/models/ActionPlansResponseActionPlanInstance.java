/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The action plans collection response.
 */
public class ActionPlansResponseActionPlanInstance {
    /**
     * The collection of action plans.
     */
    @JsonProperty(value = "plans")
    private List<ActionPlanInstance> plans;

    /**
     * The URI for the next page of data.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the plans value.
     *
     * @return the plans value
     */
    public List<ActionPlanInstance> plans() {
        return this.plans;
    }

    /**
     * Set the plans value.
     *
     * @param plans the plans value to set
     * @return the ActionPlansResponseActionPlanInstance object itself.
     */
    public ActionPlansResponseActionPlanInstance withPlans(List<ActionPlanInstance> plans) {
        this.plans = plans;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the ActionPlansResponseActionPlanInstance object itself.
     */
    public ActionPlansResponseActionPlanInstance withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}

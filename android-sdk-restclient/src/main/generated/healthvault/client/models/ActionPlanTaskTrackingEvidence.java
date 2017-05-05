/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The evidence associated Action Plan Task Tracking.
 */
public class ActionPlanTaskTrackingEvidence {
    /**
     * The Tracking IDs as evidence.
     */
    @JsonProperty(value = "trackings")
    private List<String> trackings;

    /**
     * The HealthVault ThingIDs as evidence.
     */
    @JsonProperty(value = "hvThings")
    private List<String> hvThings;

    /**
     * Get the trackings value.
     *
     * @return the trackings value
     */
    public List<String> trackings() {
        return this.trackings;
    }

    /**
     * Set the trackings value.
     *
     * @param trackings the trackings value to set
     * @return the ActionPlanTaskTrackingEvidence object itself.
     */
    public ActionPlanTaskTrackingEvidence withTrackings(List<String> trackings) {
        this.trackings = trackings;
        return this;
    }

    /**
     * Get the hvThings value.
     *
     * @return the hvThings value
     */
    public List<String> hvThings() {
        return this.hvThings;
    }

    /**
     * Set the hvThings value.
     *
     * @param hvThings the hvThings value to set
     * @return the ActionPlanTaskTrackingEvidence object itself.
     */
    public ActionPlanTaskTrackingEvidence withHvThings(List<String> hvThings) {
        this.hvThings = hvThings;
        return this;
    }

}

/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Completion Metrics for frequency based tasks.
 */
public class ActionPlanFrequencyTaskCompletionMetrics {
    /**
     * The window in which the occurrences must be completed. Possible values
     * include: 'Unknown', 'None', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "windowType")
    private String windowType;

    /**
     * The number of times the Task has to be completed.
     */
    @JsonProperty(value = "occurrenceCount")
    private Integer occurrenceCount;

    /**
     * The reminder state of the task. Possible values include: 'Unknown',
     * 'Off', 'OnTime', 'Before5Minutes', 'Before10Minutes', 'Before15Minutes',
     * 'Before30Minutes', 'Before1Hour', 'Before2Hours', 'Before4Hours',
     * 'Before8Hours'.
     */
    @JsonProperty(value = "reminderState")
    private String reminderState;

    /**
     * The days that this will show for the user
     * Expected values: { 'Unknown', 'Everyday', 'Sunday', 'Monday', 'Tuesday',
     * 'Wednesday', 'Thursday', 'Friday', 'Saturday' }.
     */
    @JsonProperty(value = "scheduledDays")
    private List<String> scheduledDays;

    /**
     * Get the windowType value.
     *
     * @return the windowType value
     */
    public String windowType() {
        return this.windowType;
    }

    /**
     * Set the windowType value.
     *
     * @param windowType the windowType value to set
     * @return the ActionPlanFrequencyTaskCompletionMetrics object itself.
     */
    public ActionPlanFrequencyTaskCompletionMetrics withWindowType(String windowType) {
        this.windowType = windowType;
        return this;
    }

    /**
     * Get the occurrenceCount value.
     *
     * @return the occurrenceCount value
     */
    public Integer occurrenceCount() {
        return this.occurrenceCount;
    }

    /**
     * Set the occurrenceCount value.
     *
     * @param occurrenceCount the occurrenceCount value to set
     * @return the ActionPlanFrequencyTaskCompletionMetrics object itself.
     */
    public ActionPlanFrequencyTaskCompletionMetrics withOccurrenceCount(Integer occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
        return this;
    }

    /**
     * Get the reminderState value.
     *
     * @return the reminderState value
     */
    public String reminderState() {
        return this.reminderState;
    }

    /**
     * Set the reminderState value.
     *
     * @param reminderState the reminderState value to set
     * @return the ActionPlanFrequencyTaskCompletionMetrics object itself.
     */
    public ActionPlanFrequencyTaskCompletionMetrics withReminderState(String reminderState) {
        this.reminderState = reminderState;
        return this;
    }

    /**
     * Get the scheduledDays value.
     *
     * @return the scheduledDays value
     */
    public List<String> scheduledDays() {
        return this.scheduledDays;
    }

    /**
     * Set the scheduledDays value.
     *
     * @param scheduledDays the scheduledDays value to set
     * @return the ActionPlanFrequencyTaskCompletionMetrics object itself.
     */
    public ActionPlanFrequencyTaskCompletionMetrics withScheduledDays(List<String> scheduledDays) {
        this.scheduledDays = scheduledDays;
        return this;
    }

}

/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MicrosoftWin32SafeHandlesSafeWaitHandle model.
 */
public class MicrosoftWin32SafeHandlesSafeWaitHandle {
    /**
     * The isInvalid property.
     */
    @JsonProperty(value = "isInvalid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isInvalid;

    /**
     * The isClosed property.
     */
    @JsonProperty(value = "isClosed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isClosed;

    /**
     * Get the isInvalid value.
     *
     * @return the isInvalid value
     */
    public Boolean isInvalid() {
        return this.isInvalid;
    }

    /**
     * Get the isClosed value.
     *
     * @return the isClosed value
     */
    public Boolean isClosed() {
        return this.isClosed;
    }

}

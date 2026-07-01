package com.vaishnavi.gamingyoti.dto.yoti;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DigitalId {

    private Boolean allowed;
    private Integer threshold;
    @JsonProperty("age_estimation_allowed")
    private Boolean ageEstimationAllowed;

    @JsonProperty("age_estimation_threshold")
    private Integer ageEstimationThreshold;

    @JsonProperty("retry_limit")
    private Integer retryLimit;

    public Boolean getAllowed() {
        return allowed;
    }

    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Boolean getAgeEstimationAllowed() {
        return ageEstimationAllowed;
    }

    public void setAgeEstimationAllowed(Boolean ageEstimationAllowed) {
        this.ageEstimationAllowed = ageEstimationAllowed;
    }

    public Integer getAgeEstimationThreshold() {
        return ageEstimationThreshold;
    }

    public void setAgeEstimationThreshold(Integer ageEstimationThreshold) {
        this.ageEstimationThreshold = ageEstimationThreshold;
    }

    public Integer getRetryLimit() {
        return retryLimit;
    }

    public void setRetryLimit(Integer retryLimit) {
        this.retryLimit = retryLimit;
    }
}
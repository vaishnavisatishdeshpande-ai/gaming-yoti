package com.vaishnavi.gamingyoti.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgeEstimation {

    private Boolean allowed;
    private Integer threshold;
    private String level;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getRetryLimit() {
        return retryLimit;
    }

    public void setRetryLimit(Integer retryLimit) {
        this.retryLimit = retryLimit;
    }
}
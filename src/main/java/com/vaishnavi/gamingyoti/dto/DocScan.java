package com.vaishnavi.gamingyoti.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocScan {

    private Boolean allowed;
    private Integer threshold;
    private String authenticity;
    private String level;
    @JsonProperty("preset_issuing_country")
    private String presetIssuingCountry;

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

    public String getAuthenticity() {
        return authenticity;
    }

    public void setAuthenticity(String authenticity) {
        this.authenticity = authenticity;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPresetIssuingCountry() {
        return presetIssuingCountry;
    }

    public void setPresetIssuingCountry(String presetIssuingCountry) {
        this.presetIssuingCountry = presetIssuingCountry;
    }

    public Integer getRetryLimit() {
        return retryLimit;
    }

    public void setRetryLimit(Integer retryLimit) {
        this.retryLimit = retryLimit;
    }
}
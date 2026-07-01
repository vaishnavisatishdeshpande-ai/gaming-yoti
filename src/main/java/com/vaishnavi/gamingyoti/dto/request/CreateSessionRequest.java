package com.vaishnavi.gamingyoti.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vaishnavi.gamingyoti.dto.yoti.AgeEstimation;
import com.vaishnavi.gamingyoti.dto.yoti.Callback;
import com.vaishnavi.gamingyoti.dto.yoti.DigitalId;
import com.vaishnavi.gamingyoti.dto.yoti.DocScan;

public class CreateSessionRequest {

    private String type;
    private Integer ttl;

    @JsonProperty("age_estimation")
    private AgeEstimation ageEstimation;

    @JsonProperty("digital_id")
    private DigitalId digitalId;

    @JsonProperty("doc_scan")
    private DocScan docScan;

    @JsonProperty("callback")
    private Callback callback;

    @JsonProperty("reference_id")
    private String referenceId;

    @JsonProperty("retry_enabled")
    private Boolean retryEnabled;

    @JsonProperty("resume_enabled")
    private Boolean resumeEnabled;

    @JsonProperty("synchronous_checks")
    private Boolean synchronousChecks;

    public CreateSessionRequest() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public AgeEstimation getAgeEstimation() {
        return ageEstimation;
    }

    public void setAgeEstimation(AgeEstimation ageEstimation) {
        this.ageEstimation = ageEstimation;
    }

    public DigitalId getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(DigitalId digitalId) {
        this.digitalId = digitalId;
    }

    public DocScan getDocScan() {
        return docScan;
    }

    public void setDocScan(DocScan docScan) {
        this.docScan = docScan;
    }

    public Callback getCallback() {
        return callback;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Boolean getRetryEnabled() {
        return retryEnabled;
    }

    public void setRetryEnabled(Boolean retryEnabled) {
        this.retryEnabled = retryEnabled;
    }

    public Boolean getResumeEnabled() {
        return resumeEnabled;
    }

    public void setResumeEnabled(Boolean resumeEnabled) {
        this.resumeEnabled = resumeEnabled;
    }

    public Boolean getSynchronousChecks() {
        return synchronousChecks;
    }

    public void setSynchronousChecks(Boolean synchronousChecks) {
        this.synchronousChecks = synchronousChecks;
    }
}
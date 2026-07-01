package com.vaishnavi.gamingyoti.dto;

import java.time.LocalDateTime;

public class VerificationResultResponse {

    private String username;
    private String verificationStatus;
    private String verificationMethod;
    private LocalDateTime verificationTimestamp;

    public VerificationResultResponse() {
    }

    public VerificationResultResponse(
            String username,
            String verificationStatus,
            String verificationMethod,
            LocalDateTime verificationTimestamp) {

        this.username = username;
        this.verificationStatus = verificationStatus;
        this.verificationMethod = verificationMethod;
        this.verificationTimestamp = verificationTimestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    public LocalDateTime getVerificationTimestamp() {
        return verificationTimestamp;
    }

    public void setVerificationTimestamp(LocalDateTime verificationTimestamp) {
        this.verificationTimestamp = verificationTimestamp;
    }
}
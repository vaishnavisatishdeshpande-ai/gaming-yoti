package com.vaishnavi.gamingyoti.dto.response;

public class SignupResponse {

    private String message;
    private String sessionId;
    private String sessionUrl;
    private String verificationStatus;

    public SignupResponse() {
    }

    public SignupResponse(String message,
                          String sessionId,
                          String sessionUrl,
                          String verificationStatus) {
        this.message = message;
        this.sessionId = sessionId;
        this.sessionUrl = sessionUrl;
        this.verificationStatus = verificationStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionUrl() {
        return sessionUrl;
    }

    public void setSessionUrl(String sessionUrl) {
        this.sessionUrl = sessionUrl;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}
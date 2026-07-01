package com.vaishnavi.gamingyoti.dto;

public class SignupResponse {

    private String message;
    private String sessionId;
    private String verificationStatus;

    public SignupResponse() {
    }

    public SignupResponse(String message, String sessionId, String verificationStatus) {
        this.message = message;
        this.sessionId = sessionId;
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

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}
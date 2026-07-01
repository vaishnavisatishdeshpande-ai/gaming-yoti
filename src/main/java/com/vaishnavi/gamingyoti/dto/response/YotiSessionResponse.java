package com.vaishnavi.gamingyoti.dto.response;

public class YotiSessionResponse {

    private String sessionId;
    private String sessionUrl;
    private String status;
    private String expiresAt;

    public YotiSessionResponse() {
    }

    public YotiSessionResponse(String sessionId,
                               String sessionUrl,
                               String status,
                               String expiresAt) {
        this.sessionId = sessionId;
        this.sessionUrl = sessionUrl;
        this.status = status;
        this.expiresAt = expiresAt;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
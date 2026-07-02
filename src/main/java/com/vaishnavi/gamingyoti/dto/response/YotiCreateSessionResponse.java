package com.vaishnavi.gamingyoti.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YotiCreateSessionResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("expires_at")
    private String expiresAt;

    @JsonProperty("status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
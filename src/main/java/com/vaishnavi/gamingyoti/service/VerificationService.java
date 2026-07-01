package com.vaishnavi.gamingyoti.service;

import com.vaishnavi.gamingyoti.client.YotiClient;
import com.vaishnavi.gamingyoti.dto.SessionResultResponse;
import org.springframework.stereotype.Service;

@Service
public class VerificationService {

    private final YotiClient yotiClient;

    public VerificationService(YotiClient yotiClient) {
        this.yotiClient = yotiClient;
    }

    public SessionResultResponse getVerificationResult(String sessionId) {
        return yotiClient.getSessionResult(sessionId);
    }
}
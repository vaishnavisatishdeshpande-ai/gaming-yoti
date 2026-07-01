package com.vaishnavi.gamingyoti.controller;

import com.vaishnavi.gamingyoti.client.YotiClient;
import com.vaishnavi.gamingyoti.dto.CreateSessionResponse;
import com.vaishnavi.gamingyoti.dto.SessionResultResponse;
import com.vaishnavi.gamingyoti.dto.VerificationResultResponse;
import com.vaishnavi.gamingyoti.dto.YotiSessionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vaishnavi.gamingyoti.service.VerificationService;

@RestController
@RequestMapping("/api")
public class YotiController {

    private final YotiClient yotiClient;
    private final VerificationService verificationService;

    public YotiController(
            YotiClient yotiClient,
            VerificationService verificationService) {

        this.yotiClient = yotiClient;
        this.verificationService = verificationService;
    }

    @PostMapping("/create-yoti-session")
    public YotiSessionResponse createSession() {
        return yotiClient.createSession();
    }

    @GetMapping("/result/{sessionId}")
    public SessionResultResponse getResult(
            @PathVariable String sessionId) {

        return verificationService.getVerificationResult(sessionId);
    }
}
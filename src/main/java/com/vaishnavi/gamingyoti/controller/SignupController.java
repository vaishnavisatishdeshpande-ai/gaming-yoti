package com.vaishnavi.gamingyoti.controller;

import com.vaishnavi.gamingyoti.dto.request.SignupRequest;
import com.vaishnavi.gamingyoti.dto.response.SignupResponse;
import com.vaishnavi.gamingyoti.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class SignupController {

    private final RegistrationService registrationService;

    public SignupController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> signup(
            @Valid @RequestBody SignupRequest request) {

        SignupResponse response = registrationService.register(request);

        return ResponseEntity.ok(response);
    }
}
package com.vaishnavi.gamingyoti.service;

import com.vaishnavi.gamingyoti.client.YotiClient;
import com.vaishnavi.gamingyoti.dto.request.SignupRequest;
import com.vaishnavi.gamingyoti.dto.response.SignupResponse;
import com.vaishnavi.gamingyoti.dto.response.YotiSessionResponse;
import com.vaishnavi.gamingyoti.model.User;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class RegistrationService {


    private final UserService userService;
    private final YotiClient yotiClient;
    private final PasswordEncoder passwordEncoder;

    public RegistrationService(UserService userService,
                               YotiClient yotiClient,
                               PasswordEncoder passwordEncoder) {

        this.userService = userService;
        this.yotiClient = yotiClient;
        this.passwordEncoder = passwordEncoder;
    }

    public SignupResponse register(SignupRequest request) {

        if (userService.userExists(request.getUsername())) {
            throw new IllegalStateException("Username already exists");
        }

        User user = new User(
                request.getUsername(),
                request.getEmail(),
                passwordEncoder.encode(request.getPassword())
        );

        userService.saveUser(user);

        YotiSessionResponse session = yotiClient.createSession(user.getUsername());

        user.setSessionId(session.getSessionId());
        user.setVerificationStatus("PENDING");

        userService.saveUser(user);

        return new SignupResponse(
                "User created successfully. Verification pending.",
                session.getSessionId(),
                session.getSessionUrl(),
                user.getVerificationStatus()
        );
    }
}
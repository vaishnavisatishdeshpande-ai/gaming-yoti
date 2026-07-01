package com.vaishnavi.gamingyoti.service;

import com.vaishnavi.gamingyoti.dto.request.SignupRequest;
import com.vaishnavi.gamingyoti.model.User;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final UserService userService;

    public RegistrationService(UserService userService) {
        this.userService = userService;
    }

    public User register(SignupRequest request) {

        if (userService.userExists(request.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
        );

        userService.saveUser(user);

        return user;
    }
}
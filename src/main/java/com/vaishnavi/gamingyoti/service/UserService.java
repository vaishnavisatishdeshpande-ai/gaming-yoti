package com.vaishnavi.gamingyoti.service;

import com.vaishnavi.gamingyoti.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {

    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    public void saveUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public boolean userExists(String username) {
        return users.containsKey(username);
    }

    public User getUserBySessionId(String sessionId) {

        return users.values()
                .stream()
                .filter(user -> sessionId.equals(user.getSessionId()))
                .findFirst()
                .orElse(null);
    }

    public void attachSession(String username, String sessionId) {

        User user = users.get(username);

        if (user != null) {
            user.setSessionId(sessionId);
            users.put(username, user);
        }
    }
}
package com.example.learning_jpa_event_listener.entity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> users() {
        return userRepository.findAll();
    }
}

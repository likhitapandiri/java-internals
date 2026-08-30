package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @PostConstruct
    public void initialize() {
        System.out.println("2. Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3. Bean destroyed");
    }

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {

        System.out.println("Inside UserService");

        userRepository.getUser();
    }
}
package org.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {

        System.out.println("Inside UserService");

        userRepository.getUser();
    }
}
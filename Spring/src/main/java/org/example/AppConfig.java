package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@Configuration
public class AppConfig {

    @Bean
    public UserRepository userRepository() {

        return new UserRepository();
    }

    @Bean
    public UserService userService(
            UserRepository userRepository
    ) {

        return new UserService(userRepository);
    } //you explicitly call the constructor.Spring manages the resulting object because it was returned from an @Bean method.
    //Later: Component Scanning,Spring calls the constructor
    @Bean
    public UserController userController(
            UserService userService
    ) {

        return new UserController(userService);
    }
}

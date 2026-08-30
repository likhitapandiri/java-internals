
package main.java.org.example;

import main.java.org.example.UserController;
import main.java.org.example.UserRepository;
import main.java.org.example.UserService;

public class Main {

    public static void main(String[] args) {

        UserRepository userRepository =
                new UserRepository();

        UserService userService =
                new UserService(userRepository);

        UserController userController =
                new UserController(userService);

        userController.getUser();
    }

    //You
    //│
    //├── created UserRepository
    //│
    //├── injected it into UserService
    //│
    //└── injected UserService into UserController
}
package org.example;
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void getUser() {

        System.out.println("Inside UserController");

        userService.getUser();
    }
}
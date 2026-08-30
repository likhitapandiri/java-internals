package main.java.org.example;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public void getUser(){
        System.out.println("User service");
        userRepository.getUser();
    }
}

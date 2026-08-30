package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void getUser() {
        System.out.println("Getting user from repository");
    }
}
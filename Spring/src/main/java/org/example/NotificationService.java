package org.example;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(){
        System.out.println("send notification");
    }
}


//try removing service annotation : to check optional coz bean will not be there without annotation
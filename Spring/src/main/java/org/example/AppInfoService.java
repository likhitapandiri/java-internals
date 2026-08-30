package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppInfoService {

    private final String appName;
    private final String version;
    private final int maxUsers;


    public AppInfoService(
           @Value("${app.name")
           String appName,

           @Value("${app.version}")
           String version,

           @Value("${app.max-users}")
           int maxUsers

    ){
        this.appName=appName;
        this.maxUsers=maxUsers;
        this.version=version;
    }



public void printAppInfo() {
    System.out.println(
            "Name: " + appName
    );

    System.out.println(
            "Version: " + version
    );

    System.out.println(
            "Max Users: " + maxUsers
    );
}
}
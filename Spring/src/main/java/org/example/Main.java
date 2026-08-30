package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class
                );  //You are essentially saying:Spring, create an ApplicationContext using this configuration.

        UserController userController =
                context.getBean(UserController.class);

        userController.getUser();

        UserService service1 =
                context.getBean(UserService.class);

        UserService service2 =
                context.getBean(UserService.class);

        System.out.println(service1 == service2);
    }
}
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(
//                        AppConfig.class
//                );  //You are essentially saying:Spring, create an ApplicationContext using this configuration.
//

        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context1.getEnvironment().setActiveProfiles("prod");
        context1.scan("org.example");
        System.out.println("Application is running");
        PaymentService paymentService =
                context1.getBean(PaymentService.class);

        paymentService.pay();
        context1.close();

    }
}
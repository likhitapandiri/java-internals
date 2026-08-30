package org.example;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("stripePayment")
@Profile("dev")
@Primary
public class StripePaymentService implements PaymentService{

    private final Optional<NotificationService> notificationService;

    public StripePaymentService(Optional<NotificationService> notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void pay() {
        System.out.println("Payment using Stripe");
        if (notificationService.isPresent()) {
            notificationService.get().sendNotification();
        }
    }
}

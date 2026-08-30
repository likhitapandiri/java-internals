package org.example;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service("paypalPayment")
public class PaypalPaymentService implements PaymentService{
    private final ObjectProvider<NotificationService> notificationService;

    public PaypalPaymentService(ObjectProvider<NotificationService> notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void pay() {
        System.out.println("Payment using PayPal");

        NotificationService notificationService1 = notificationService.getIfAvailable();

        notificationService1.sendNotification();
    }
}

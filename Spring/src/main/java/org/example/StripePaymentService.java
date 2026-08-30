package org.example;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripePayment")
@Primary
public class StripePaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment using Stripe");

    }
}

package org.example;

import org.springframework.stereotype.Service;

@Service("paypalPayment")
public class PaypalPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Payment using PayPal");
    }
}

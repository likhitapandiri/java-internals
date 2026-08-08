package Ecommerce.Payments.Interfaces;

public class CardPaymentImpl implements PaymentGateway {

    @Override
    public void processPaymnet() {
        System.out.println("Processing Card Payment");
    }
}

package Ecommerce.Payments.Interfaces;

public class UpiPaymentImpl implements PaymentGateway {
    @Override
    public void processPaymnet() {
        System.out.println("Processing UPI Payment");
    }
}

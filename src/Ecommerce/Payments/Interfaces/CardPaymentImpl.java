package Ecommerce.Payments.Interfaces;

public class CardPaymentImpl implements PaymentGateway,Refundable,Trackable {
   //CardPayment can implement all three interfaces
    //one class implementing multiple interfaces - which is other way of multiple inherotance which java doesnt allow
    @Override
    public void processPaymnet() {
        System.out.println("Processing Card Payment");
    }

    @Override
    public void refund() {

        System.out.println("Refunding Card Payment");

    }

    @Override
    public void track() {

        System.out.println("Tracking Card Payment");

    }
}

package OOPS_ecommerce.Payments.Interfaces;

public interface PaymentGateway {
    void processPaymnet(); //this is an abstract method -each class must implement it

    default void process(){
        System.out.println("default method");
    }
}

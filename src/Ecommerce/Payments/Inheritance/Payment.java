package Ecommerce.Payments.Inheritance;
public abstract class Payment {

    private final int paymentId;
    private final double amount;

    public Payment(int paymentId, double amount) {

        this.paymentId = paymentId;
        this.amount = amount;

    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public final void makePayment(){
        System.out.println("Validating Payment");
        processPayment();
        System.out.println("Payment Successful");
        System.out.println();
    }
    //why not each child have makePaymnet -The entire method is identical.and duplicating it in child and also
    //why final :
    // @Override
    //    public void makePayment() {
    //        processPayment();
    //    }
    //suppose ur company has a rule of validation then payment and if overided method misses validation - payment sys is broken at that child

    //final is not used because we don't want overriding in general.
    //It's used because : The overall algorithm must never change. Only one or more specific steps are allowed to vary.
    public abstract void processPayment();

}
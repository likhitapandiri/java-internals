package Ecommerce;

public final class Payment {

    private final int paymentId;
    private final double amount;
    private final String method;

    public Payment(int paymentId, double amount, String method) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public final void printReceipt() {
        System.out.println("Payment Successful");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Method: " + method);
        System.out.println("------------------");

    }
}
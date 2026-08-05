package Ecommerce.Payments;

public class UPIPayment extends Payment {

    private String upiId;

    public UPIPayment(
            int paymentId,
            double amount,
            String upiId
    ) {

        super(paymentId, amount);

        this.upiId = upiId;

    }

    @Override
    public void processPayment() {

        System.out.println("Processing UPI Payment");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : ₹" + getAmount());

    }

}

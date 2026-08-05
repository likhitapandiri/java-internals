package Ecommerce.Payments;

public class WalletPayment extends Payment {

    private String walletName;

    public WalletPayment(
            int paymentId,
            double amount,
            String walletName
    ) {

        super(paymentId, amount);

        this.walletName = walletName;

    }

    @Override
    public void processPayment() {

        System.out.println("Processing Wallet Payment");
        System.out.println("Wallet : " + walletName);
        System.out.println("Amount : ₹" + getAmount());

    }

}
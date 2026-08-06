package Ecommerce.Payments;

public class PaymentFactory {

    public static Payment getPaymentType(String type) {
        if (type.equals("CARD")) {
            return new CardPayment(
                    101,
                    2500,
                    "1234-5678-9012",
                    "HDFC"
            );
        } else if (type.equals("WALLET")) {
            return new WalletPayment(
                    103,
                    800,
                    "Paytm"
            );
        } else if (type.equals("UPI")) {

            return new UPIPayment(
                    102,
                    1500,
                    "likhita@upi"
            );
        } else {
            throw new IllegalArgumentException("Payment type not found.");
        }
    }
}

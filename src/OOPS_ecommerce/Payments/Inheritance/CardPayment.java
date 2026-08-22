package OOPS_ecommerce.Payments.Inheritance;

public class CardPayment extends Payment {
    private String cardNumber;
    private String bankNumber;

    public CardPayment(
            int paymentId,
            double amount,
            String cardNumber,
            String bankNumber
    ){
        super(paymentId,amount);
        this.cardNumber=cardNumber;
        this.bankNumber=bankNumber;
    }

    @Override
    public void processPayment() {

        System.out.println("Processing Card Payment");
        System.out.println("Bank : " + bankNumber);
        System.out.println("Card : " + cardNumber);
        System.out.println("Amount : ₹" + getAmount());

    }


}

import Ecommerce.Customer.Customer;
import Ecommerce.Order.Order;
import Ecommerce.Payments.*;
import Ecommerce.Product.Product;

public class Main {

    public static void main(String[] args) {
     polymorphism();
    }

    public static void objectCall(){
        ClassSyntax c= new ClassSyntax(); //does NOT contain the object.It contains the reference to the object.

        c.id = 1;
        c.name = "Laptop";
        c.price = 70000;
        c.stock = 5;

        c.display();
    }

    public static void stringUtilityCall() {
        StringUtility s = new StringUtility();
        String st = "Hello abcdddeefff";
        System.out.println(s.reverse(st));
        System.out.println(s.checkPalindrome(st));
        System.out.println(s.countVowels(st));
        System.out.println(s.countVowels(st));
        System.out.println(s.removeSpacesEnd(st));
        System.out.println(s.removeSpaces(st));
        System.out.println(s.compressCharacters(st));
    }

    public static void encapsulation(){
        Product laptop = new Product(101,"Laptop",70000,5);
        laptop.setPrice(-1000);
        laptop.setPrice(50000);
        System.out.println(laptop.getPrice());

        Customer customer = new Customer(1,"Likhita","likhita@gmail.com");

        Order order = new Order(
                1001,
                laptop,customer,2
        );

        laptop.display();
        customer.display();
        order.display();

    }

    public static void inheritance(){
        CardPayment card = new CardPayment(
                101,
                2500,
                "1234-5678-9012",
                "HDFC"
        );

        UPIPayment upi = new UPIPayment(
                102,
                1500,
                "likhita@upi"
        );

        WalletPayment wallet = new WalletPayment(
                103,
                800,
                "Paytm"
        );

        card.processPayment();
        System.out.println();

        upi.processPayment();
        System.out.println();

        wallet.processPayment();


    }

    public static void polymorphism(){
        try{

            Payment card = PaymentFactory.getPaymentType("CARD");
            card.makePayment();

            Payment upi = PaymentFactory.getPaymentType("UPI");
            upi.makePayment();

            Payment wallet = PaymentFactory.getPaymentType("WALLET");
            wallet.makePayment();

            Payment randomPayment = PaymentFactory.getPaymentType("RANDOM");
            randomPayment.makePayment();

        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }



}
import Ecommerce.Customer;
import Ecommerce.Order;
import Ecommerce.Product;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World ");
//        stringUtilityCall();
        objectCall();
        productCall();


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

    public static void productCall(){
        Product p1 = new Product(101, "Laptop", 70000, 5);
        Product p2 = new Product(102, "Mouse", 500, 20);

        Customer c1 = new Customer(1, "Likhita", "likhita@example.com");

        Order order = new Order(1001, p1, c1, 2);

        p1.display();
        p2.display();
        c1.display();
        order.display();
    }


}
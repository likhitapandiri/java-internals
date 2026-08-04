
package Ecommerce;

public class Customer {
    int id;
    String name;
    String email;

    public Customer(int var1, String var2, String var3) {
        this.id = var1;
        this.name = var2;
        this.email = var3;
    }

    public void display() {
        System.out.println("Customer: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("------------------");
    }
}

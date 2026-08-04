
package Ecommerce;

public class Order {
    int orderId;
    Product product;
    Customer customer;
    int quantity;

    public Order(int var1, Product var2, Customer var3, int var4) {
        this.orderId = var1;
        this.product = var2;
        this.customer = var3;
        this.quantity = var4;
    }

    public void display() {
        System.out.println("Order ID: " + this.orderId);
        System.out.println("Customer: " + this.customer.name);
        System.out.println("Product: " + this.product.name);
        System.out.println("Quantity: " + this.quantity);
    }
}

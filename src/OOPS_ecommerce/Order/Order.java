
package OOPS_ecommerce.Order;

import OOPS_ecommerce.Customer.Customer;
import OOPS_ecommerce.Product.Product;

public class Order {

    private final int orderId;
    private final Product product;
    private final Customer customer;
    private int quantity;

    public Order(int orderId, Product product, Customer customer, int quantity) {

        if (orderId <= 0) {
            throw new IllegalArgumentException("Order ID must be positive.");
        }

        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }

        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }

        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        setQuantity(quantity);
    }

    public int getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public void display() {

        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + customer.getName());
        System.out.println("Product  : " + product.getName());
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : ₹" + getTotalPrice());
        System.out.println("------------------");


    }

}
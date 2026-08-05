
package Ecommerce.Product;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        }

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {

        if (stock >= 0) {
            this.stock = stock;
        }

    }

    public void display() {
        System.out.println("Product: " + this.name);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Stock: " + this.stock);
        System.out.println("------------------");
    }
}

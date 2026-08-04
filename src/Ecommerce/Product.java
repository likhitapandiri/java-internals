
package Ecommerce;

public class Product {
    static String company = "ShopEasy";
    int id;
    String name;
    double price;
    int stock;

    public Product(int var1, String var2, double var3, int var5) {
        this.id = var1;
        this.name = var2;
        this.price = var3;
        this.stock = var5;
    }

    public void display() {
        System.out.println("Product: " + this.name);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Stock: " + this.stock);
        System.out.println("------------------");
    }
}

package Collections;

import java.util.List;
import java.util.ArrayList;

//linked list also as interface list is same all methods will be same behaviour will be same but internal impl will differ
public class ArrayImpl {

    private List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        try {
            products.add(product);
        } catch (Exception e) {
            System.out.println("Unable to add product: " + e.getMessage());
        }
    }

    public String getProductByIndex(int index) {
        try {
            return products.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
            return null;
        }
    }

    public void editProduct(String product, int index) {
        try {
            products.set(index, product);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
        }
    }

    public void insertAtIndex(String product, int index) {
        try {
            products.add(index, product);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
        }
    }

    public void removeProduct(int index) {
        try {
            products.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
        }
    }

    public int search(String product) {
        try {
            return products.indexOf(product);
        } catch (Exception e) {
            System.out.println("Unable to search product: " + e.getMessage());
            return -1;
        }
    }

    public List<String> getAllProducts() {
        return new ArrayList<>(products);
    }
}

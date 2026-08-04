
package Ecommerce;

public class Customer {

    private final int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        setName(name);
        setEmail(email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public void display() {
        System.out.println("Customer: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("------------------");
    }

}

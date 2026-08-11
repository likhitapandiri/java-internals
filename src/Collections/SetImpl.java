package Collections;

import Ecommerce.Product.Product;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {

    private Set<Product> products= new HashSet<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public void removeProduct(Product p){
        products.remove(p);
    }

    public void search(Product p){
        System.out.println(products.contains(p));
    }

    public void getAllProducts(){
        for(Product p:products){
//           p.display();
            System.out.println(p);
        }
    }

}

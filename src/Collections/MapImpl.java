package Collections;

import OOPS_ecommerce.Product.Product;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {

    Map<Long, Product>productById = new HashMap<>();

    public void addProduct(Long id,Product p){
        productById.put(id,p);
    }

    public void removeProduct(Long id){
        productById.remove(id);
    }

    public void searchValue(Product p){
        System.out.println(productById.containsValue(p));
    }

    public void searchKey(Long id){
        System.out.println(productById.containsKey(id));
    }

    public void getProduct(Long id){
        productById.get(id).display();
    }

    public void getAllProducts(){
        for(Map.Entry<Long,Product> p:productById.entrySet()){
            System.out.println(p.getKey());
            System.out.println(p.getValue());
            p.getValue().display();
        }
    }
}

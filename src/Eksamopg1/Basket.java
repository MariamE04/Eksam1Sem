package Eksamopg1;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        if(products != null){
            products.add(product);
            System.out.println(product.getName() + " .added to basket.");
        } else {
            System.out.println("Cannot add null product");
        }
    }

    public double calculateTotalPoint(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    public void printall(){
        if(products.isEmpty()){
            System.out.println("Basket is empty");
        } else {
            System.out.println("Products in the basket:");
           for(Product product : products){
                System.out.println(product.toString());
            }
        }
    }

}

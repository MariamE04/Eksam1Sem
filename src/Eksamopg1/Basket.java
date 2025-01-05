package Eksamopg1;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void printAll() {
        if (products.isEmpty()) {
            System.out.println("The basket is empty.");
            return;
        }

        System.out.println("Clothes");
        for (Product product : products) {
            if (product instanceof Clothes) {
                System.out.println(product.toString());
            }
        }

        System.out.println("\nElectronics");
        for (Product product : products) {
            if (product instanceof Electronic) {
                System.out.println(product.toString());
            }
        }

        System.out.println("\nFood");
        for (Product product : products) {
            if (product instanceof Food) {
                System.out.println(product.toString());
            }
        }

        System.out.printf("\nTotal: %.2f euro\n", calculateTotalPrice());
    }


    private double calculateTotalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

}

/*public void removeProduct(Product product) {
    if (products.contains(product)) {
        products.remove(product);
    } else {
        System.out.println("Produktet findes ikke i kurven.");
    }
}*/

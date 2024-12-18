package Eksamopg1;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
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
                Clothes clothes = (Clothes) product;
                System.out.println(clothes.getName() + " , " +
                        clothes.getColor() + " Size " + " , " +
                        clothes.getSize() + " : " +
                        clothes.getPrice() + " euro");
            }
        }

        System.out.println("\\nElectronics");
        for (Product product : products) {
            if (product instanceof Electronic){
                Electronic electronic = (Electronic) product;
                System.out.println(electronic.getName() + " , " +
                        electronic.getWarrantyNoOfMonths() + "  months warranty: " +
                        electronic.getPrice() + " euro");
            }
        }

        System.out.println("\nFood");
        for (Product product : products){
            if(product instanceof Food){
                Food food = (Food) product;
                System.out.println(food.getName() + " , " +
                        food.getExpireDate() + " : " +
                        food.getPrice() + " euro");
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


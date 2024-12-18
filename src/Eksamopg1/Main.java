package Eksamopg1;

public class Main {
    public static void main(String[] args) {
       Basket basket = new Basket();

       basket.addProduct(new Clothes("T-shirt", 49.85, "black", 10));
       basket.addProduct(new Electronic("Headset", 80.00,8) );
       basket.addProduct(new Food("Milk", 1.68, "21. December 2024"));

       basket.printAll();
    }
}

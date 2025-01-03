//Main-klassen fungerer som indgangspunktet til programmet.
// Det er her, vi tester og demonstrerer funktionaliteten af de andre klasser i programmet

package Eksamopg1;

public class Main {
    public static void main(String[] args) {
       Basket basket = new Basket();

       basket.addProduct(new Clothes("T-shirt", 49.85, "black", 10));
       basket.addProduct(new Clothes("Sweater",52.01, "White", 8));


       basket.addProduct(new Electronic("Headset", 80.00,8) );
       basket.addProduct(new Electronic("Chargar",30.50,9));


       basket.addProduct(new Food("Milk", 1.68, "21. December 2024"));
       basket.addProduct((new Food("Bread",2.5,"23. December 2024")));


       basket.printAll();
    }
}

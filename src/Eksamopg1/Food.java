package Eksamopg1;

public class Food extends Product {
    private String expireDate;

    public Food(String name, double price, String expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return getName() + ", " + expireDate + ": " + getPrice() + " euro";
    }
}


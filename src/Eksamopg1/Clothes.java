package Eksamopg1;

public class Clothes extends Product {
    private String color;
    private int size;

    public Clothes(String name, double price, String color, int size) {
        super(name, price);
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return getName() + ", " + color + ", size " + size + ": " + getPrice() + " euro";
    }
}


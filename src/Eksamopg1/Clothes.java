package Eksamopg1;

public class Clothes extends Product {
    private String color;
    private int size;

    public Clothes(String name, double price, String color, int size) {
        super(name, price);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getName() + " , Color: " + getColor() + " , Size: " + getSize() + " , " + getPrice() + " euro";
    }

}


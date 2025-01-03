package Eksamopg1;

public class Electronic extends Product {
    private int warrantyNoOfMonths;

    public Electronic(String name, double price, int warrantyNoOfMonths) {
        super(name, price);
        this.warrantyNoOfMonths = warrantyNoOfMonths;
    }

    public int getWarrantyNoOfMonths() {
        return warrantyNoOfMonths;
    }

    @Override
    public String toString() {
        return getName() + " , months warranty:  " + getWarrantyNoOfMonths() + " , " + getPrice() + " euro";
    }
}


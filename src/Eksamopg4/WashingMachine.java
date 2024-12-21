package Eksamopg4;

public class WashingMachine implements LaundryMachine{
    private int duration;
    private double price;
    private boolean isRunnig;
    private int capacity;

    public WashingMachine( int capacity) {
        this.capacity = capacity;
        this.price = capacity * 1.2;
    }

    @Override
    public void chooseProgram() {


    }

    @Override
    public void displayPriceAndDuration() {

    }

    @Override
    public void start() {

    }

    @Override
    public void addExtra() {

    }
}

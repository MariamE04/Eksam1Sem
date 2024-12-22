package Eksamopg4;

import java.util.Scanner;

public class WashingMachine implements LaundryMachine{
    private int duration;
    private double price;
    private boolean isRunnig;
    private int capacity;
    private Scanner scan;

    public WashingMachine( int capacity) {
        this.capacity = capacity;
        this.price = capacity * 1.2;
        this.scan = new Scanner(System.in);
    }

    @Override
    public void chooseProgram() {
            System.out.println("indtast et tal, for følgne muligheder ");
            System.out.println("1) Uld og silk");
            System.out.println("2) Bomuld 40");
            System.out.println("3) Bomuld 60");
            int choice = scan.nextInt();

            switch (choice){
                case 1 -> System.out.println("Program 1: 30 min.");
                case 2 -> System.out.println("Program 2: 50 min.");
                case 3 -> System.out.println("Program 3: 60 min.");
                default -> System.out.println("Invalid input. Please try again.");
            }

    }

    @Override
    public void displayPriceAndDuration() {
        System.out.println("Pris pr. minut: " + price + " kr.");
        System.out.println("Varighed: " + duration + " minutter.");
        System.out.println("Samlet pris: " + (price * duration) + " kr.");
    }


    @Override
    public void start(int duration) {
        this.duration =duration;
        this.isRunnig = true;
        System.out.println("Maskinen er startet og vil køre i " + duration + " minutter.");
    }


    @Override
    public void addExtra() {

    }
}

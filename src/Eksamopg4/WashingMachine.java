package Eksamopg4;

import java.util.Scanner;

public class WashingMachine implements LaundryMachine{
    private int duration;
    private double price;
    private boolean isRunnig;
    private int capacity;
    private Scanner scan;
    private boolean preWashAdded;

    public WashingMachine( int capacity) {
        this.capacity = capacity;
        this.price = capacity * 1.2;
        this.scan = new Scanner(System.in);
        this.preWashAdded = false; // Forvask er ikke tilføjet som standard
    }

    @Override
    public void chooseProgram() {
            System.out.println("indtast et tal, for følgne muligheder ");
            System.out.println("1) Uld og silk");
            System.out.println("2) Bomuld 40");
            System.out.println("3) Bomuld 60");
            int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                duration = 30;
                System.out.println("Program 1: 30 min.");
            }
            case 2 -> {
                duration = 50;
                System.out.println("Program 2: 50 min.");
            }
            case 3 -> {
                duration = 60;
                System.out.println("Program 3: 60 min.");
            }
            default -> System.out.println("Ugyldigt input. Prøv igen.");
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
        if(!isRunnig){   // Forvask kan kun tilføjes før maskinen starter
            if(!preWashAdded){  // Kun én forvask tilladt
                price += 5;     // Forvask koster 5 kr.
                preWashAdded = true;    // Marker, at forvask er tilføjet
                System.out.println("Forvask er blevet tilføjet. Pris +5 kr.");
            } else {
                System.out.println("Forvask kan kun tilføjes én gang.");
            }
        }

    }
}

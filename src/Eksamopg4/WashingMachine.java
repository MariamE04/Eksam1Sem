package Eksamopg4;

import java.util.Scanner;

public class WashingMachine implements LaundryMachine{
    private int duration; //Programvarighed.
    private double price; //Prisen pr. minut
    private boolean isRunnig; //angiver, om maskinen kører.
    private int capacity; //kapacitet i kilogram
    private Scanner scan; //input fra brugeren
    private boolean preWashAdded; //forvask er tilføjet

    public WashingMachine( int capacity) {
        this.capacity = capacity;
        this.price = capacity * 1.2;
        this.scan = new Scanner(System.in);
        this.preWashAdded = false; // Forvask er ikke tilføjet som standard
    }

    //Giver brugeren mulighed for at vælge et vaskeprogram, som bestemmer varigheden.
    @Override
    public void chooseProgram() {
            System.out.println("---------");
            System.out.println("indtast et tal, for følgne muligheder ");
            System.out.println("1) Uld og silk");
            System.out.println("2) Bomuld 40");
            System.out.println("3) Bomuld 60");
            System.out.println("---------");
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

    //Beregner og viser samlet pris og varighed for vasken
    @Override
    public void displayPriceAndDuration() {
        System.out.println("Pris pr. minut: " + price + " kr.");
        System.out.println("Varighed: " + duration + " minutter.");
        System.out.println("Samlet pris: " + (price * duration) + " kr.");
    }


    //Metoden tager en parameter for at specificere varigheden
    @Override
    public void start(int duration) {
        this.duration = duration;
        this.isRunnig = true;
        System.out.println("Maskinen er startet og vil køre i " + duration + " minutter.");
    }


    //Giver mulighed for at tilføje en forvask før maskinen starter
    @Override
    public void addExtra() {
        if (!isRunnig) {   // Forvask kan kun tilføjes før maskinen starter
            if (!preWashAdded) {  // Kun én forvask tilladt
                price += 5;     // Forvask koster 5 kr.
                preWashAdded = true;    // Marker, at forvask er tilføjet
                System.out.println("Forvask er blevet tilføjet. Pris +5 kr.");
            } else {
                System.out.println("Forvask kan kun tilføjes én gang.");
            }
        }
    }


    @Override
    public String toString() {
        return "Vaskemaskine med kapacitet: " + capacity + " kg";
    }
}

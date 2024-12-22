package Eksamopg4;

import java.util.Scanner;

public class Dryer implements LaundryMachine {
    private int duration;
    private double price;
    private Scanner scan;

    public Dryer() {
        this.duration = 30; // Standard varighed for tørretumbler
        this.price = 0.5; // Pris pr. minut
        this.scan = new Scanner(System.in);
    }

    @Override
    public void chooseProgram() {
        System.out.println("Indtast et tal for følgende muligheder:");
        System.out.println("1) Lav varme");
        System.out.println("2) Høj varme");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Du har valgt lav varme.");
            case 2 -> System.out.println("Du har valgt høj varme.");
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
        this.duration = duration;
        System.out.println("Maskinen er startet og vil køre i " + duration + " minutter.");
    }

    @Override
    public void addExtra() {
        this.duration += 10; // Tilføj 10 minutter
        System.out.println("10 ekstra minutter er blevet tilføjet.");
        System.out.println("Ny varighed: " + duration + " minutter.");
        System.out.println("Samlet pris: " + (price * duration) + " kr.");
    }

    @Override
    public String toString() {
        return "Tørretumbler med standard varighed: " + duration + " minutter";
    }
}



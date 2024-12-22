package Eksamopg4;

import java.util.Scanner;

public class Dryer implements LaundryMachine {
    private int duration;
    private double price;
    private Scanner scan;

    public Dryer() {
        this.duration = 30;
        this.price = duration * 0.5;
        this.scan = new Scanner(System.in);
    }

    @Override
    public void chooseProgram() {
        System.out.println("indtast et tal, for følgne muligheder ");
        System.out.println("1) Lav varme");
        System.out.println("2) Høj varme");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Du har vaglt lav varme");
            case 2 -> System.out.println("Du har vaglt Høj varme");
            default -> System.out.println("Invalid input. Please try again.");
            }
        }

    @Override
    public void displayPriceAndDuration() {

    }

    @Override
    public void start(int duration) {

    }

    @Override
    public void addExtra() {

    }
}


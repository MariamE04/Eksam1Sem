package Eksamopg4;

import java.util.ArrayList;
import java.util.Scanner;

public class LaundryService {
    private ArrayList<LaundryMachine> laundryMachines;

    public LaundryService() {
        this.laundryMachines = new ArrayList<>();
    }

    public void addMachine(LaundryMachine laundryMachine) {
        laundryMachines.add(laundryMachine);
    }

    public LaundryMachine chooseMachine() {
        if (laundryMachines.isEmpty()) {
            System.out.println("Der er ingen maskiner tilgængelige.");
            return null;
        }

        System.out.println("Vælg en maskine fra listen:");
        for (int i = 0; i < laundryMachines.size(); i++) {
            System.out.println((i + 1) + ") " + laundryMachines.get(i).toString()); // Brug toString her
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        // Sikrer, at brugeren vælger en gyldig maskine
        while (choice < 1 || choice > laundryMachines.size()) {
            System.out.print("Indtast nummeret på maskinen, du vil vælge: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ugyldigt input. Prøv igen.");
                scanner.next(); // Ryd scanner buffer
            }
        }

        LaundryMachine chosenMachine = laundryMachines.get(choice - 1);
        System.out.println("Du har valgt: " + chosenMachine.toString());
        return chosenMachine;
    }
}
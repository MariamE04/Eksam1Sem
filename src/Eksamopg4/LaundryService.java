//fungerer som en controller for alle vaskemaskiner og tørretumblere.
//holder styr på tilgængelige maskiner og lader brugeren vælge og administrere dem

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

        // Spørg brugeren om de vil vælge en vaskemaskine eller tørretumbler
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("Vælg type maskine:");
        System.out.println("1) Vaskemaskine");
        System.out.println("2) Tørretumbler");
        System.out.println("---------");
        int choice = scanner.nextInt();

        ArrayList<LaundryMachine> filteredMachines = new ArrayList<>();

        // Filtrer maskiner baseret på brugerens valg
        for (LaundryMachine machine : laundryMachines) {
            if ((choice == 1 && machine instanceof WashingMachine) ||
                    (choice == 2 && machine instanceof Dryer)) {
                filteredMachines.add(machine);
            }
        }

        if (filteredMachines.isEmpty()) {
            System.out.println("Ingen maskiner af den valgte type tilgængelige.");
            return null;
        }

        // Vis de tilgængelige maskiner af den valgte type

        System.out.println("Vælg en maskine fra listen:");
        for (int i = 0; i < filteredMachines.size(); i++) {
            System.out.println((i + 1) + ") " + filteredMachines.get(i).toString());
        }

        int validChoice = -1; //"ugyldig" startværdi.
        while (validChoice < 1 || validChoice > filteredMachines.size()) {
            System.out.print("Indtast nummeret på maskinen, du vil vælge: ");
            if (scanner.hasNextInt()) {
                validChoice = scanner.nextInt();
            } else {
                System.out.println("Ugyldigt input. Prøv igen.");
                scanner.next(); // Ryd scanner buffer
            }
        }

        LaundryMachine chosenMachine = filteredMachines.get(validChoice - 1);
        System.out.println("Du har valgt: " + chosenMachine.toString());
        return chosenMachine;
    }
}
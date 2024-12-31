package Eksamopg5;

import java.util.ArrayList;
import java.util.Scanner;

public class RickshawService {
    private String[][] districts;
    private ArrayList<Driver> drivers;

    public RickshawService() {
        this.drivers = new ArrayList<>();
        this.districts = new String[3][3];
        districts[0] = new String[]{"Christiania", "Operaen", "Havnebad Islands Brygge"};
        districts[1] = new String[]{"Tivoli", "Rådhuspladsen", "Christiansborg"};
        districts[2] = new String[]{"Amalienborg", "Strøget", "Nyhavn"};
    }

    public Driver createDriver(String name, int[] districtCoverage) {
        Driver driver = new Driver(name, false, districtCoverage);
        drivers.add(driver);
        return driver;
    }

    public void bookDriver() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vælg en destination:");
        for (int i = 0; i < districts.length; i++) {
            for (int j = 0; j < districts[i].length; j++) {
                System.out.println((i * 3 + j + 1) + ") " + districts[i][j]);
            }
        }

        int input = scan.nextInt();

        if (input < 1 || input > 9) {
            System.out.println("Ugyldigt input. Vælg et tal mellem 1 og 9.");
            return;
        }

        int districtNumber = (input - 1) / 3 + 1;
        String destination = districts[(input - 1) / 3][(input - 1) % 3];
        System.out.println("Du har valgt: " + destination);

        String result = findDriver(districtNumber);
        System.out.println(result);
    }

    private String findDriver(int districtNumber) {
        for (Driver driver : drivers) {
            for (int district : driver.districtCoverage) {
                if (district == districtNumber && !driver.isbooked) {
                    driver.isbooked = true;
                    return "Chauffør: " + driver.name + " er tilgængelig";
                }
            }
        }
        return "Der blev ikke fundet nogen ledig chauffør";
    }
}



/*  // Distrikt 1
        districts[0][0] = "Christiania";
        districts[0][1] = "Operaen";
        districts[0][2] = "Havnebad Islands Brygge";

        // Distrikt 2
        districts[1][0] = "Tivoli";
        districts[1][1] = "Rådhuspladsen";
        districts[1][2] = "Christiansborg";

        // Distrikt 3
        districts[2][0] = "Amalienborg,";
        districts[2][1] = "Strøget";
        districts[2][2] = "Nyhavn";
*/

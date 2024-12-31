package Eksamopg5;

import java.util.ArrayList;
import java.util.Scanner;

public class RickshawService {
    private String [][] districts;
    private ArrayList<Driver> drivers;

    public RickshawService() {
        this.drivers = new ArrayList<>();

        this.districts = new String[3][3];
        districts[0] = new String[]{"Christiania", "Operaen", "Havnebad Islands Brygge"};
        districts[1] = new String[]{"Tivoli", "Rådhuspladsen", "Christiansborg"};
        districts[2] = new String[]{"Amalienborg", "Strøget", "Nyhavn"};

}

    public Driver creatDriver(String name, int[] districtCoverage){
        Driver driver = new Driver(name,false,districtCoverage); //Standard bookingsstatus: false
        drivers.add(driver);
        return driver;
    }

    public void bookDriver(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Du har bestilt en chauffør. Indtast et tal for at vælge destinationen:");
        System.out.println("1) Christiania");
        System.out.println("2) Operaen");
        System.out.println("3) Havnebad Islands Brygge");
        System.out.println("4) Tivoli");
        System.out.println("5) Rådhuspladsen");
        System.out.println("6) Christiansborg");
        System.out.println("7) Amalienborg");
        System.out.println("8) Strøget");
        System.out.println("9) Nyhavn");
        int input = scan.nextInt();

        // Bestem distriktnummer baseret på brugerens input
        int districtNumber = 0;
        if(input >= 1 && input <= 3){
            districtNumber = 1;
        } else if (input >= 4 && input <= 6){
            districtNumber = 2;
        } else if (input >= 7 && input <= 9) {
            districtNumber = 3;
        }

        System.out.println("Du har vaglt: " + input);
        // Find og udskriv besked om ledig chauffør
        String result = findDriver(districtNumber);
        System.out.println(result);

    }

    private String findDriver(int districtNumber) {
        // Gå igennem alle chauffører
        for (Driver driver : drivers) {
            // Tjek om chaufføren dækker distriktet
            for (int district : driver.districtCoverage) {
                if (district == districtNumber) {
                    // Tjek om chaufføren er ledig
                    if (!driver.isbooked) {
                        // Markér chaufføren som booket og returner
                        driver.isbooked = true;
                        return "Chauffør: " + driver.name + " er tilgængelig";
                    }
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

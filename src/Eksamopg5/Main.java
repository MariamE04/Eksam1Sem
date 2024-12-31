package Eksamopg5;

public class Main {
    public static void main(String[] args) {
        // Opretter en instans af RickshawService
        RickshawService service = new RickshawService();

        // Opretter nogle chauffører og deres dækningsområder
        int[] driver1Coverage = {1}; // Driver 1 dækker distrikt 1
        int[] driver2Coverage = {2}; // Driver 2 dækker distrikt 2
        int[] driver3Coverage = {3}; // Driver 3 dækker distrikt 3

        service.createDriver("Anders", driver1Coverage);
        service.createDriver("Maria", driver2Coverage);
        service.createDriver("Jonas", driver3Coverage);

        // Bestil en chauffør
        service.bookDriver();
    }
}



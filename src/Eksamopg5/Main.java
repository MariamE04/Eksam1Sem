package Eksamopg5;

public class Main {
    public static void main(String[] args) {
        // Opretter en instans af RickshawService
        RickshawService service = new RickshawService();

        // Opretter nogle chauffører og deres dækningsområder
        int[] driver1Coverage = {1}; // Driver 1 dækker distrikt 1 og 2
        int[] driver2Coverage = {2}; // Driver 2 dækker distrikt 3
        int[] driver3Coverage = {1, 3}; // Driver 3 dækker distrikt 1 og 3

        service.creatDriver("Anders", driver1Coverage);
        service.creatDriver("Maria", driver2Coverage);
        service.creatDriver("Jonas", driver3Coverage);

        // Bestil en chauffør
        service.bookDriver();
    }
}



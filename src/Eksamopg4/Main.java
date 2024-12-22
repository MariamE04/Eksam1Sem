package Eksamopg4;

public class Main {
    public static void main(String[] args) {
        LaundryService laundryService = new LaundryService();

        // Tilføj én vaskemaskine med kapacitet 5 kg
        laundryService.addMachine(new WashingMachine(5));

        // Tilføj én tørretumbler
        laundryService.addMachine(new Dryer());

        // Vælg maskine
        LaundryMachine currentMachine = laundryService.chooseMachine();

        if (currentMachine != null) {
            // Test de forskellige metoder på den valgte maskine
            currentMachine.chooseProgram();
            currentMachine.addExtra();  // Tilføj ekstra funktioner, som forvask
            currentMachine.displayPriceAndDuration();  // Print oplysninger én gang
            currentMachine.start(30);  // Start maskinen
            currentMachine.addExtra();  // Hvis nødvendigt, tilføj ekstra funktioner igen
        }
    }
}


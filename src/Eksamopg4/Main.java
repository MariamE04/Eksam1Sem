package Eksamopg4;

public class Main {
    public static void main(String[] args) {
        LaundryService laundryService = new LaundryService();

        // Tilføj én vaskemaskine med kapacitet 5 kg og en med 7 kg
        laundryService.addMachine(new WashingMachine(5));
        laundryService.addMachine(new WashingMachine(7));


        // Tilføj én tørretumbler
        laundryService.addMachine(new Dryer());

        // Vælg maskine
        LaundryMachine currentMachine = laundryService.chooseMachine();

        if (currentMachine != null) {
            // Test de forskellige metoder på den valgte maskine
            currentMachine.chooseProgram();
            System.out.println("Du har vaglt flg. maksine: " + currentMachine);
            System.out.println("---------");
            currentMachine.displayPriceAndDuration();//
            System.out.println("---------");
            currentMachine.addExtra();  // Tilføj ekstra funktioner, som forvask
            currentMachine.displayPriceAndDuration();// Print oplysninger én gang
            System.out.println("---------");
            currentMachine.start(30);  // Start maskinen
            currentMachine.addExtra();  // viser fejlbesked hvis det er en vaskemaskine
            currentMachine.displayPriceAndDuration();

        }
    }
}


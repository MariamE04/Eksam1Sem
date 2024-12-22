package Eksamopg4;

public class Main {
    public static void main(String[] args) {
        LaundryService laundryService = new LaundryService();

        laundryService.addMachine(new WashingMachine(5));
        laundryService.addMachine(new WashingMachine(7));
        laundryService.addMachine(new Dryer());

        LaundryMachine currentMachine = laundryService.chooseMachine();

        if(currentMachine != null){
            currentMachine.chooseProgram();
            currentMachine.displayPriceAndDuration();
            currentMachine.addExtra();
            currentMachine.displayPriceAndDuration();
            currentMachine.start(30);
            currentMachine.addExtra();
            currentMachine.displayPriceAndDuration();
        }
    }
}

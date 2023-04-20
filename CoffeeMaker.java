public class CoffeeMaker {
    boolean cupPresence;
    boolean addingSugar;
    boolean addingMilk;
    boolean addCoffeePowder;
    boolean output;

    public CoffeeMaker(boolean cupPresence, boolean addingSugar, boolean addingMilk, boolean addCoffeePowder) {
        this.cupPresence = cupPresence;
        this.addingSugar = addingSugar;
        this.addingMilk = addingMilk;
        this.addCoffeePowder = addCoffeePowder;
    }

    public void makeCoffee(){
        output=true;
        while(output) {
            if (cupPresence) {
                System.out.println("Cup found below Coffee Maker");
            }
            if (addingSugar) {
                System.out.println("Added 2 cubes of sugar");
            }
            if (addingMilk) {
                System.out.println("Adding Milk");
            }
            if (addCoffeePowder) {
                System.out.println("Added Coffee powder");
            }
            if (cupPresence&&addingSugar&&addingMilk&&addCoffeePowder){
                System.out.println("Your Coffee Prepared Successfully");
                output=false;
            }else {
                System.out.println("Sorry Can't Prepare now\n Something Missing Please try again");
                output=false;
            }
        }
    }
    public void makeBlackCoffee(){
        output=true;
        while(output) {
            if (cupPresence) {
                System.out.println("Cup found below Coffee Maker");
            }
            if (addingSugar) {
                System.out.println("Added 2 cubes of sugar");
            }

            if (addCoffeePowder) {
                System.out.println("Added Coffee powder");
            }
            if (cupPresence&&addingSugar&&addingMilk&&addCoffeePowder){
                System.out.println("Your Black Coffee Prepared Successfully");
                output=false;
            }else {
                System.out.println("Sorry Can't Prepare now\n Something Missing Please try again");
                output=false;
            }
        }
    }
}

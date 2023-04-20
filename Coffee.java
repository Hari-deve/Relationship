public class Coffee {
    String coffeeBrand;
    String coffeeType;
    int numberOfCubesForOneCup;

    public Coffee(String coffeeBrand, String coffeeType, int numberOfCubesForOneCup) {
        this.coffeeBrand = coffeeBrand;
        this.coffeeType = coffeeType;
        this.numberOfCubesForOneCup = numberOfCubesForOneCup;
    }
    public void detailsOfCoffeePowder(){
        System.out.println("Name of Coffee Powder: "+coffeeBrand);
        System.out.println("Type of Coffee Powder: "+coffeeType);
        System.out.println("Preferred no of sugar cubes: "+numberOfCubesForOneCup);
    }
}

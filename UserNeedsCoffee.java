import java.util.Scanner;

public class UserNeedsCoffee {
    static Scanner userChoose=new Scanner(System.in);
    public static void main(String[] args) {
        Coffee powderDetails=new Coffee("Nestle","Filter",2);
        CoffeeMaker makerContents=new CoffeeMaker(true,true,true,true);
        System.out.println("Please select the options give below\n1.Coffee\n2.Black Coffee\n3.Details of Coffee Powder");
        int option=userChoose.nextInt();
        if (option==1) {
            makerContents.makeCoffee();
        }
        else if (option==2) {
            makerContents.makeBlackCoffee();
        } else if (option==3) {
            powderDetails.detailsOfCoffeePowder();
        }else {
            System.out.println("Please select correct option");
        }

    }
}

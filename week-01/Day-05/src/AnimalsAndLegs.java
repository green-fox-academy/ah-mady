import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("How many chicken does the farmer has? ");
        int chickens = myObj.nextInt();

        System.out.println("How many pigs does the farmer has? ");
        int pigs = myObj.nextInt();

        System.out.println("Farmer has " + (chickens * 2) + " chicken leg pieces and " + (pigs * 4) + " legs of pigs.");
    }
}

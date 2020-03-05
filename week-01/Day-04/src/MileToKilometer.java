import java.util.Scanner;
public class MileToKilometer {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please Enter distance in miles: ");

        double mile = myObj.nextDouble();


        double kiloMeter = mile * 1.61;

        System.out.println( mile + " miles are " + kiloMeter + " kilometers");


    }
}

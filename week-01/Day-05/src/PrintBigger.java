import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {

        System.out.println("I will tell you which one of two given number is bigger.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please type in first number: ");

        double firstNum = myObj.nextDouble();

        System.out.println("Please type in second number: ");
        double secondNum = myObj.nextDouble();

        if (firstNum > secondNum){
            System.out.println(firstNum + " is bigger.");
        }else if (firstNum < secondNum){
            System.out.println(secondNum + " is bigger.");
        }else{
            System.out.println("They both are same idiot.");
        }



    }
}

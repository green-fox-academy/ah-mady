import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one

        Scanner myObj = new Scanner(System.in);
        System.out.println("First number: ");

        int firstNumber = myObj.nextInt();

        System.out.println("Second Number: ");
        int secondNumber = myObj.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("The second number should be bigger");
        }else for (int i = firstNumber; i < secondNumber; i++) {
            System.out.println(i);

        }

    }
}

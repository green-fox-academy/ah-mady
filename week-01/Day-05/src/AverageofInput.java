import java.util.Scanner;
public class AverageofInput {
    public static void main(String[] args) {

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        System.out.println("I will give you the sum and average of 4 given integers. :) ");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type in the first integer: ");
        double firstInteger = myObj.nextInt();

        System.out.println("Type in the second integer: ");
        double secondInteger = myObj.nextInt();

        System.out.println("Type in the third integer: ");
        double thirdInteger = myObj.nextInt();


        System.out.println("Type in the forth integer: ");
        double forthInteger = myObj.nextInt();

        double sum = firstInteger + secondInteger + thirdInteger + forthInteger;
        double average = (firstInteger + secondInteger + thirdInteger + forthInteger) /4;

        System.out.println("Sum: " + sum + " Average: " + (average));


    }
}

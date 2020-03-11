import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

        //division();
        exceptionHandler();

    }
    public static void division() {
        int n = 10;
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int dividor = myNum.nextInt();
        int result = n / dividor;
        System.out.println(result);
    }
    public static void exceptionHandler(){
        try{
            division();
        }catch(ArithmeticException e){
            System.out.println("fail!");
        }catch (MissingFormatArgumentException e){
            System.out.println("Wrong Input.");
        }finally {
            System.out.println("finally reached.");
        }
    }
}

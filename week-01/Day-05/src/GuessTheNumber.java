import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

        int actualNumber = 1 + (int) (Math.random() * 99);
        int count = 0;
        int guessedNumber = 0;

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("I am think of number from 1 to 100 ... Guess the number: ");



        while (guessedNumber != actualNumber){
            guessedNumber = inputNumber.nextInt();
            count++;
            if (guessedNumber > actualNumber){
                System.out.println("The stored number is lower");
            }else if(guessedNumber < actualNumber){
                System.out.println("The stored number is higher");
            }

        }
        System.out.println("You found the number : " + actualNumber + " with " + count + " tries.");

    }
}

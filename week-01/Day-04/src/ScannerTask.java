import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        // Creates a scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");

        // The program stops and waits for user input and to press enter
        String userInput1 = scan.next();

        // It prints the whole line that was given by the user
        System.out.println(userInput1);
        System.out.println("Enter the Int: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scan.nextInt();

        // It prints the integer
        System.out.println(userInput2);


/*        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input*/

    }

}

import java.util.Scanner;

public class ChessTable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("how many lines you want? ");
        int lines = myObj.nextInt();

        for (int i = 1; i <= lines ; i++) {

            if (i % 2 == 0) {
                System.out.print(" ");
            }
            System.out.print("* * * *");
            System.out.println();
        }

    }
}


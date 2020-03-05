import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner table = new Scanner(System.in);
        System.out.println("Please Enter the positive number: ");
        int num = table.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println( i + " * " + num + " = " + num * i);
        }
    }
}

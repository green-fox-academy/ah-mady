import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String greeting = name.next();

        System.out.println("Hello "+greeting+ "!");

        System.out.println("Please Enter your friend's name: ");
        String friendName = name.next();
        System.out.println("Hello " + friendName + ", friend of " + greeting+ ".");
    }
}

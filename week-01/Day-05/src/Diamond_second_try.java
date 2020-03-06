import java.util.Scanner;
public class Diamond_second_try {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Type in any ODD number: ");
        int lines = myObj.nextInt();

        int mid = (lines + 1) / 2;

        //upper
        for (int i = 1; i <= mid; i++) {
            //space
            for (int s = 1; s <= (mid - i); s++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for (int i = 1; i <=(mid-1) ; i++) {
            //space
            for (int s = 1; s <= i ; s++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*(mid-i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if (lines%2==0){
            System.out.println();
            System.out.println("Well, I think You meant " + (lines-1) + " by " + lines+ ". Since I haven't emphasized enough on ODD numbers in the beginning.");
        }
    }
}

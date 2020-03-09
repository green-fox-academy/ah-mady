import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

/*
        int n = 7;
        System.out.println(n);

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i -1; j++) {
//                System.out.print("% ");
                if (
                        i >= 2 && j <=i-2
                ){
                    System.out.print(" ");
                } else{
                    System.out.print("%");
                }
            }
            System.out.println(" ");
*/
// copied from colleague
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int numberOfLines = input.nextInt();

        int spaceBefore = 0;
        int spaceAfter = numberOfLines-3-spaceBefore; //-3 --> -2-1


        for (int i = 0; i < numberOfLines ; i++) {
            if (i == 0 || i == (numberOfLines-1)){
                for (int j = 0; j < numberOfLines ; j++) {
                    System.out.print("%");
                }
            }else{
                System.out.print("%");
                for (int k = 0; k < spaceBefore; k++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                for (int l = 0; l < spaceAfter; l++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                spaceBefore++;
                spaceAfter--;
            }
            System.out.println("");

        }
    }
}

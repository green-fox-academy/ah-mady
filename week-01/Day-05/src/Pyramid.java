public class Pyramid {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        for(int i=0;i<10;i++) {
            for(int j=0;j<10-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("%");
            }
            System.out.println();
        }
    }
}

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Triangle {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        int rows = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows ; j++) {
              //  System.out.print("*");
                if (i >= j){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }

            System.out.println(" ");
            }

        }
    }


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        Path str = Paths.get("duplicate-char.txt");
        int n = str.getNameCount();
        System.out.println(decryptString(str, n));

        decryptString("duplicate-char.txt", 2);



    }

    static String decryptString(Paths str, int n)
    {

        // Initial jump will be 1
        int i = 0, jump = 1;
        String decryptedStr = "";

        while (i < n)
        {
            decryptedStr += str.charAt(i);
            i += jump;

            // Increment jump by 1 with every character
            jump++;
            System.out.println(str);
        }

        return decryptedStr;
    }

    // Driver code
   /* public static void main(String[] args)
    {
        String str = "geeeeekkkksssss";
        int n = str.length();
        System.out.println(decryptString(str, n));
    }*/

 /*  public static List<Character> duplicateChars () throws IOException {
       Path path = Paths.get("duplicate-char.txt");
       List<String> word = Files.readAllLines(path);
       for (int i = 0; i < duplicateChars().size(); i++) {
           duplicateChars()
       }
   }*/
}

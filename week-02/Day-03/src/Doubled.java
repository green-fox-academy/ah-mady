import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Doubled {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts the duplicated-chars.txt

        decryptChars();

        //WITHOUT the special character
        //tried adding UTF8 but no gain



    }

    public static void decryptChars() {
        try {
            Path path = Paths.get("duplicate-char.txt");
            List<String> oldLines = Files.readAllLines(path);
            List<String> newLines = new ArrayList<>();
            for (String line : oldLines) {
                String newLine = "";
                for (int i = 0; i < line.length()-1; i+=2) {
                    newLine+=line.charAt(i);
                    char special = '©';

                    if(line.charAt(i) != line.charAt(i+1) || line.charAt(i) == special) {
                        newLine+=line.charAt(i+1);
                    }
                }

                newLines.add(newLine);
            }
            Files.write(Paths.get("decrypted-chars.txt"), newLines);
        } catch (IOException e) {
            System.out.println("IOException\n" + e);
        }
    }
}
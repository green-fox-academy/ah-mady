import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        readFiles();

    }

    public static void readFiles () throws IOException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("File name: ");
        String paths = myObj.nextLine();
        try {
            Path path = Paths.get(paths);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        }catch (NoSuchFileException e){
            System.out.println("Unable to read file " + paths);
        }
    }

}

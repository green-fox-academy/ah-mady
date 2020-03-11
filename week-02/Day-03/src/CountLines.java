import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    readFiles();
    }

    public static void readFiles() throws IOException {
      /*  Scanner myObj = new Scanner(System.in);
        System.out.println("File name: ");
        String paths = myObj.nextLine();*/
        Path path = Paths.get("my-file.txt");
        try {
            //Path path = Paths.get(paths);
            List<String> lines = Files.readAllLines(path);
            int counter = 0;
            while(counter < lines.size()){
                counter++;
            }
            System.out.println(counter);
        } catch (NoSuchFileException e) {
            System.out.println("zero");
        }catch (Exception e){
            System.out.println();
        }
    }
}
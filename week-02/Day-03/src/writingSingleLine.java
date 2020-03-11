import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class writingSingleLine {
    public static void main(String[] args) throws IOException {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        writeFile();
    }
    public static void writeFile() throws IOException {
        Path path = Paths.get("my-file.txt");
        try{
            List<String> lines = readFile();
            lines.add("Muhammad Ahmed");
            Files.write(path, lines);
        }catch (NoSuchFileException e){
            System.out.println("Unable to write file: my-file.txt");
        }catch (IOException e){
            System.out.println();
        }
    }

    public static List<String> readFile() throws IOException {
        Path path = Paths.get("my-file.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }
        return lines;
    }
}

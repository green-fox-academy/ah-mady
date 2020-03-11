import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Struct;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

        copyFile();
    }


    public static boolean copyFile() throws IOException {
        Path path = Paths.get("my-text.txt");
        Path path2 = Paths.get("my-file.txt");
        List<String> lines = Files.readAllLines(path);
        Files.write(path2, lines);

        /*for (String line : lines) {
            System.out.println(line);*/
        return true;
    }
}



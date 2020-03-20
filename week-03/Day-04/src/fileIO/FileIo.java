package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIo {
  public static void main(String[] args) {
    readFile();
    System.out.println("File successfully read");

    writeFile();
    System.out.println("File writing method finished!");

  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path path = Paths.get("textFiles/text3.txt");
      lines = Files.readAllLines(path);

      for (String line : lines) {
        System.out.println(line);
      }

    } catch (NoSuchFileException e) {
      System.out.println("File was not found");
      e.printStackTrace();
    } catch (IOException e){
      e.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      System.out.println("Finally block reached");
    }

    return lines;
  }

  public static void writeFile(){
    Path path = Paths.get("textFiles/text.txt");
    List <String> lines = readFile();
    lines.add("heyyyyyyyyyyyyyyyyy");

    try {

      Files.write(path, lines);
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}

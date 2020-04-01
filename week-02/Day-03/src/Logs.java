import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        Path path = Paths.get("log.txt");

    }

    public static String[] uniqueIP(String... args){
        List<String> logLines = new ArrayList<>();
        for (String logLine: args) {
            logLines.add(logLine);
        }
        List<String> uniqueIpAddress = new ArrayList<>();
        for (String logLine: logLines) {
            
        }

    }
}

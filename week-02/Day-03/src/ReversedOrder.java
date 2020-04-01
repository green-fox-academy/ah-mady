import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {

        reverseOrder();

    }

    public static void reverseOrder() {

        try {
            Path oldPath = Paths.get("reversed-order.txt");
            List<String> oldLines = Files.readAllLines(oldPath);
            List<String> newLines = new ArrayList<>();
            for (int i = oldLines.size()-1; i >=0 ; i--) {
                newLines.add(oldLines.get(i));
            }
            Files.write(Paths.get("new-order.txt"), newLines);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

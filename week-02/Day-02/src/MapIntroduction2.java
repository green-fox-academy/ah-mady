import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("978-1-60309-452-8",	"A Letter to Jo");
        map.put("978-1-60309-459-7",	"Lupus");
        map.put("978-1-60309-444-3",	"Red Panda and Moon Bear");
        map.put("978-1-60309-461-0",	"The Lab");



        String newKeys = "";

        String newValues = "";


        for (Map.Entry<String, String> oneEntry : map.entrySet()) {
            newKeys = oneEntry.getKey();
            newValues = oneEntry.getValue();
            System.out.println( newValues + " (ISBN: " + newKeys + ")");
        }
        System.out.println();

        map.remove("978-1-60309-444-3");

        map.put("978-1-60309-450-4", "They Called Us Enemy");
        map.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if (map.containsKey("478-0-61159-424-8")){
            System.out.println("It contains the given key");
        }else{
            System.out.println("It doesn't contain the given key");
        }

        System.out.println(map.get("978-1-60309-453-5"));

        System.out.println(map.keySet());

    }
}

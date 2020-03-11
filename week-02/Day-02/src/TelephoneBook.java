import com.sun.jdi.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("William A. Lathan", "405-709-1865");
        map.put("John K. Miller", "402-247-8568");
        map.put("Hortensia E. Foster", "606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println(map.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String newValue : map.keySet()) {
            if (map.get(newValue).equals("307-687-2982")) {
                System.out.println(newValue);
            }
        }

        //Do we know Chris E. Myers' phone number?
        for (String newKey : map.values()) {
            if (map.containsValue("Brooke P. Askew")) {
               // System.out.println(newKey);
                System.out.println(map.get("Brooke P. Askew"));
//            } else {
//                System.out.println("We don't know the value of given key!");
//            }
            }

        }
    }
}

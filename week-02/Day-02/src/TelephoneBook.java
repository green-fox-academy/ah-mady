import com.sun.jdi.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephoneBook = new HashMap();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println(telephoneBook.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String newValue : telephoneBook.keySet()) {
            if (telephoneBook.get(newValue).equals("307-687-2982")) {
                System.out.println(newValue);
            }
        }

        //Do we know Chris E. Myers' phone number?
        for (String newKey : telephoneBook.values()) {
            if (telephoneBook.containsValue(newKey)) {
                System.out.println(telephoneBook.get("Chris E. Myers"));
            }else{
                System.out.println("Value not found");
            }

        }
    }
}

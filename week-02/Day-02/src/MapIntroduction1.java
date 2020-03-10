import java.util.HashMap;

public class MapIntroduction1 {

    public static void main(String[] args) {

        HashMap<Integer, Character> map = new HashMap<>();

        map.put(97,'a');
        map.put(98,'b');
        map.put(99,'c');
        map.put(65,'A');
        map.put(66,'B');
        map.put(67,'C');

        //getting key set values
        System.out.println(map.keySet());

        //getting the value
        System.out.println(map.values());

        //adding a new key and value
        map.put(68, 'D');

        for(Integer key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        //size of the hashmap
        System.out.println(map.size());

        //getting value associated with key 99
        System.out.println(map.get(99));

        //remove the key value pair of 97
        map.remove(97);

        //whether our HashMap contains the key of 100 or not
        if(map.containsKey(100)){
            System.out.println("Map HashMap contains key of 100.");
        }else {
            System.out.println("Map HashMap does not contains key of 100.");
        }

        //clearing out all the data
        map.clear();
        if (map.isEmpty()){
            System.out.println("our HashMAp is Empty now");
        }else {
            System.out.println("out HashMap contains some data");
        }

    }
}

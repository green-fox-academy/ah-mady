import java.util.*;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List <String> listA = new ArrayList<>();
        listA.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        List<String> listB = new ArrayList<>(listA);

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        //get the index of Avocado in list A
        System.out.println(listA.indexOf("Avocado"));

        //get the index of Durian from ListB
        System.out.println(listB.indexOf("Durian"));


        //add passion and pamelo is single statement
        listB.addAll(Arrays.asList("Passion", "Pomelo"));

        //get the third element from listA
        System.out.println(listA.get(2));

        System.out.println(listA);

        System.out.println(listB);

    }
}

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println(names);

        //adding William

        names.add("Williams");
        //Checking if list is empty

        if (names.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println("List is not Empty");
        }
        //adding two more names

        names.add("John");
        names.add("Amanda");

        //checking the size

        System.out.println(names.size());

        //getting specific element

        System.out.println(names.get(2));

        //getting the whole list

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //getting the whole list with the number

        for (int i = 0; i < names.size(); i++) {

            System.out.println((i + 1) + ". " + names.get(i));
        }

        //removing one item

        names.remove(1);

        //reverse iteration

        for (int i = names.size() - 1; i >= 0; i--) {

            System.out.println(names.get(i));
        }

        //remove all elements
        names.clear();
        if (names.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println("List is not Empty");

        }
    }
}

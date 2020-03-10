import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarOutputStream;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> myExpenses = new ArrayList<>();
        myExpenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        Integer sum ;
        //How much have we spent?

        for (int i = 0; i <=myExpenses.size() ; i++) {
            sum += myExpenses.get(i);
        }

        System.out.println(sum);

    }
}

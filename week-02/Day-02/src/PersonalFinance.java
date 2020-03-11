import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarOutputStream;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> myExpenses = new ArrayList<>();
        myExpenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //How much have we spent?
        double sum = 0;
        for (int i = 0; i < myExpenses.size(); i++) {
            sum += myExpenses.get(i);
        }
        System.out.println(sum);

        //Which was our greatest expense?
        double greaterExpense= Collections.max(myExpenses);
        System.out.println(greaterExpense);

        //Which was our cheapest spending?
        double cheapestExpense = Collections.min(myExpenses);
        System.out.println(cheapestExpense);

        //What was the average amount of our spendings?
        NumberFormat formatter = new DecimalFormat("#0.00");
        double averageSpending = sum / myExpenses.size();
        System.out.println(formatter.format(averageSpending));
    }
}

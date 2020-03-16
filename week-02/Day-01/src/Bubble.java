import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }

  public static String bubble(int[] intList) {
    Arrays.sort(intList);
    return Arrays.toString(intList);
  }

  public static String advancedBubble(int[] intList, boolean descendingIfTrue) {
    Arrays.sort(intList);
    if (descendingIfTrue == true) {
      int[] descendingOrder = new int[intList.length];
      int counter = 0;
      for (int i = intList.length - 1; i > -1 ; i--) {
        descendingOrder[counter] = intList[i];
        counter++;
      }
      return Arrays.toString(descendingOrder);
    } else {
      return Arrays.toString(intList);
    }
  }

}
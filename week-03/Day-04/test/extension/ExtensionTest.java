package extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(1, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {

    assertEquals(3, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    List<Integer> intList=new ArrayList<>();
    intList.add(7);
    intList.add(5);
    intList.add(3);
    intList.add(5);

   int medianReturn = extension.median(intList);

    assertEquals(5, medianReturn);
  }

  @Test
  void testMedian_five() {

    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('i'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    String word = "bemutatkozik";
    String modifiedWord = extension.translate("bemutatkozik");
    assertEquals("bevemuvutavatkovozivik", modifiedWord);
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
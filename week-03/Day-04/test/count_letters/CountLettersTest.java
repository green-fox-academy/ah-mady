package count_letters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class CountLettersTest {

  @Test
  public void countCharsInString() {
    CountLetters countString = new CountLetters();
    String inputWord = "Ahmed";
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('A', 1);
    map.put('h',2);
    map.put('m',3);
    map.put('e',4);
    map.put('d',5);

    assertEquals(map, countString.countCharsInString(inputWord));
  }
}
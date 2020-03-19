package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AnagramTest {

  @Test
  public void isAnagram() {
    //Anagram anagram = new Anagram();
    String[] words = new String[] {"car", "rac"};

    boolean anagramReturn = Anagram.isAnagram(words);

    assertEquals(true,anagramReturn);
  }
}
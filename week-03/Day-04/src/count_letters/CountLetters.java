package count_letters;

import java.util.HashMap;

public class CountLetters {

  public static void main(String[] args) {

    System.out.println(countCharsInString("AHMED"));

  }

  public static HashMap<Character, Integer> countCharsInString(String inputWord) {

    HashMap<Character, Integer> charString = new HashMap<>();

    char[] arrayOfChar = new char[inputWord.length()];

    for (int i = 0; i < inputWord.length(); i++) {
      arrayOfChar[i] = inputWord.charAt(i);
    }

    int count = 0;
    for (int i = 0; i < arrayOfChar.length; i++) {
      for (int j = 0; j < arrayOfChar.length; j++) {
       // count++;
        if (arrayOfChar[i] == arrayOfChar[j]) {
          count++;
        }
      }
      charString.put(arrayOfChar[i], count);
    }
    return charString;
  }
}

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(palindromeBuilder("123"));

  }

  public static String palindromeBuilder(String word) {
    char array[] = word.toCharArray();
    String newWord = "";
    int wordLength = word.length();
    for (int i = 0; i < wordLength; i++) {
      newWord += array[i];
    }
    for (int i = 0; i < wordLength; i++) {
      newWord += array[wordLength - i -1];
    }
    return newWord;
  }

}

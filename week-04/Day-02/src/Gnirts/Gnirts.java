public class Gnirts implements CharSequence{

  String someString;
  public Gnirts(String someString) {
    this.someString = someString;
  }

  @Override
  public int length() {
    return someString.length();
  }

  @Override
  public char charAt(int i) {
    char character = someString.charAt(someString.length() - i -1);
    return character;
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return null;
  }

  public static void main(String[] args) {
      Gnirts g = new Gnirts("example");
      System.out.println(g.charAt(1));

  }
}

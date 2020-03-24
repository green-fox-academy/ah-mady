public class Shifter implements CharSequence {

  String someString;
  int i;
  public Shifter(String someString, int i) {
    this.someString = someString;
    this.i = i;
  }

  @Override
  public int length() {
    return someString.length();
  }

  @Override
  public char charAt(int i) {
    char character = someString.charAt(this.i);
    return character;
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return null;
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
  }

}

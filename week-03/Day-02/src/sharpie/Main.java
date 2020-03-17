package sharpie;

public class Main {
  public static void main(String[] args) {

    Sharpie pen1 = new Sharpie("blue", 1.5f);

    System.out.println(pen1.inkAmount);

    pen1.use();

    System.out.println(pen1.inkAmount);


  }
}

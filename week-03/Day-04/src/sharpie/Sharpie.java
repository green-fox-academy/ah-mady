package sharpie;

public class Sharpie {
  String color;
  float width;
  public float inkAmount;

  public Sharpie() {
  }

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }
}

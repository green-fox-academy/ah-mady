package sharpie;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Main {
  public static void main(String[] args) {

    Sharpie pen1 = new Sharpie("blue", 1.5f);

    System.out.println(pen1.inkAmount);

    for (int i = 0; i <10 ; i++) {
      pen1.use();
    }
    System.out.println(pen1.inkAmount);

  }
}

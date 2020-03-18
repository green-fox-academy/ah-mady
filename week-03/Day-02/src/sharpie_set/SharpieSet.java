package sharpie_set;

import java.util.ArrayList;
import java.util.List;
import sharpie.Sharpie;

public class SharpieSet {

  List<Sharpie> setOfSharpie;

  public SharpieSet() {
    setOfSharpie = new ArrayList<>();
  }

  public int countUsable() {
    int count = 0;
    for (Sharpie sharpie : this.setOfSharpie) {
      if (sharpie.inkAmount < 0) {
        count++;
      }
    }
    return count;
  }

  public void removeTrash() {
    for (int i = 0; i < this.setOfSharpie.size(); i++) {
      if (this.setOfSharpie.get(i).inkAmount <= 0) {
        this.setOfSharpie.remove(i);
        i--;
      }
    }
  }
}

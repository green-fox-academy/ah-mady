package Comparable;

import java.util.ArrayList;
import java.util.List;

public class Fleet extends Thing implements Comparable<Thing> {
  protected ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }

/*  @Override
  public int compareTo(Thing thing) {
    if (completed) {
      return 1;
    } else {
      return 0;
    }
  }*/

  @Override
  public int compareTo(Thing fleets) {
/*    if (completed) {
      return 1;
    } else {
      return -1;
    }*/
    return this.name.compareTo(fleets.name);
  }
}


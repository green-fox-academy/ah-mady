package Comparable;

import java.util.Arrays;
import java.util.Collections;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing getMilk = new Thing("Get Milk");
    Thing removeObstacle = new Thing("remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Eat Lunch");

    fleet.add(getMilk);
    fleet.add(removeObstacle);
    fleet.add(standUp);
    fleet.add(eatLunch);

    standUp.complete();
    eatLunch.complete();
//this code doesn't work
    //Collections.sort();
    //Arrays.sort(fleet);

    System.out.println(fleet);
  }
}

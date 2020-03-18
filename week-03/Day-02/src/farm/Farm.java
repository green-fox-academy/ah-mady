package farm;

import animal.Animal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Farm {

  public String farmName;
  public int sizeOfFarm = 5;

  ArrayList<Animal> ahmedsFarm = new ArrayList<>();

  public Farm(){

  }

  public Farm(String farmName) {
    this.farmName = farmName;
  }

  public void breed(Animal animalObject) {

    if (sizeOfFarm > 0) {
      ahmedsFarm.add(animalObject);
      sizeOfFarm--;
      System.out.println("");
      for (Animal line : ahmedsFarm) {
        System.out.println(line.animalName);
      }
    } else {
      System.out.println("Sorry, no more space for more animals");
    }
  }

  public void slaughter() {

    int hungerMin = 100;
    Animal toBeRemoved = null;

    for (Animal line : ahmedsFarm) {

      if (line.hunger < hungerMin) {
        hungerMin = line.hunger;
        toBeRemoved = line;
      }
    }

    ahmedsFarm.remove(toBeRemoved);

    System.out.println();
    System.out.println("The " + toBeRemoved.animalName + " was slaughtered. Cause it wasnt hungry enough.");
  }

}
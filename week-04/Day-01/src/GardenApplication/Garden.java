package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> plants;

  public Garden(){
    this.plants = new ArrayList<>();
  }

  public void addNewPlant (Plant plant){
    this.plants.add(plant);
  }

  public void info(){
    for (Plant plant: this.plants) {
      if (plant instanceof Tree){
        System.out.println("The " + plant.color +" Tree "
            + (((Tree) plant).doesItNeedWater() ? "needs " : "doesn't need ") + "water.");
      } else {
        System.out.println("The " + plant.color +" Flower "
            + (((Flower) plant).doesItNeedWater() ? "needs " : "doesn't need ") + "water.");

      }
    }
  }

  public double plantsThatNeedWater(List<Plant> plants , double amount){
    int counter = 0;
    for (Plant plant: plants) {
      if (plant.doesItNeedWater()){
        counter++;
      }
    }
    return amount / counter;
  }

  public void waterPlants (int amount){
    System.out.println("Watering with " + amount);
    double waterAmountForEachPlant = plantsThatNeedWater(this.plants,amount);
    for (Plant plant: plants) {
      if (plant.doesItNeedWater()){
        if (plant instanceof Tree){
          ((Tree) plant).setWater(waterAmountForEachPlant);
        }else{
          ((Flower)plant).setWater(waterAmountForEachPlant);
        }
      }
    }
  }
}

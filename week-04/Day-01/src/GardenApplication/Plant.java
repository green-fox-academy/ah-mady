package GardenApplication;

import java.util.List;

public class Plant {

  public String color;
  public double water;

  public Plant(String color, int water){
    this.color = color;
    this.water = water;
  }

  public double getWater() {
    return water;
  }

  public void setWater(double water) {
    this.water = water;
  }

  public boolean doesItNeedWater(){
    if (water > 0){
      return false;
    }else{
      return true;
    }
  }
}

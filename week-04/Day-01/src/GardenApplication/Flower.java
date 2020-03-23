package GardenApplication;

public class Flower extends Plant {

  public Flower(String color, int water) {
    super(color, water);
  }

  @Override
  public void setWater(double water) {
    double waterValue = this.getWater();
    this.water = waterValue + (water * 0.75);
  }

  @Override
  public boolean doesItNeedWater() {
    if (super.water <5){
      return true;
    }else{
      return false;
    }
  }
}

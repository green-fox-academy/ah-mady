package GardenApplication;

public class Tree extends Plant {

  public Tree(String color, int water) {
    super(color, water);
  }

  @Override
  public void setWater(double water) {
    double waterValue = this.getWater();
    this.water = waterValue + (water * 0.4);
  }

  @Override
  public boolean doesItNeedWater() {
    if (super.water<10){
      return true;
    }else{
      return false;
    }
  }
}

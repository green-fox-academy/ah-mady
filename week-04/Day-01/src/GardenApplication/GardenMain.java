package GardenApplication;

public class GardenMain {

  public static void main(String[] args) {
   /* Flower yellowFlower = new Flower("yellow",0);
    Flower blueFlower = new Flower("blue",0);
    Tree purpleTree = new Tree("purple", 0);
    Tree orangeTree = new Tree("orange", 0);*/

    Garden garden = new Garden();

    garden.addNewPlant(new Flower("yellow", 0));
    garden.addNewPlant(new Flower("blue", 0));
    garden.addNewPlant(new Tree("purple", 0));
    garden.addNewPlant(new Tree("orange", 0));

    garden.info();
    System.out.println();
    garden.waterPlants(40);
    garden.info();
    System.out.println();
    garden.waterPlants(70);
    garden.info();

  }
}

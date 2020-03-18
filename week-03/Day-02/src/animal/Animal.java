package animal;

public class Animal {
  public int hunger = 50;
  public int thirst = 50;
  public String animalName;

  public Animal(){

    //this(50, 50);
  }


  public Animal(String animalName){

    this.animalName = animalName;
  }

  public Animal(int hunger, int thirst){
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int eat() {
    hunger--;
    System.out.println("After eating, hunger level decreased to " + hunger + " for " + animalName);
    return hunger;
  }

  public int drink() {
    thirst--;
    System.out.println("After drinking, thirst level decreased to " + thirst + " for " + animalName);
    return thirst;
  }

  public void play(){
    hunger++;
    thirst++;
  }

}

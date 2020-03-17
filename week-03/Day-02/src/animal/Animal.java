package animal;

public class Animal {
  int hunger;
  int thirst;

  public Animal(){
    this(50, 50);
  }

  public Animal(int hunger, int thirst){
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int eat() {
    hunger--;
    return hunger;
  }

  public int drink() {
    thirst--;
    return thirst;
  }

  public void play(){
    hunger++;
    thirst++;
  }

}

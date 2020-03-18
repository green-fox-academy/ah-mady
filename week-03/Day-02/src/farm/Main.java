package farm;

import animal.Animal;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm("AhmedsFarm");

    System.out.println(farm.ahmedsFarm.size());
    System.out.println(farm.sizeOfFarm);

    Animal dog = new Animal("dog");
    farm.breed(dog);

    Animal pig = new Animal ("pig");
    farm.breed(pig);

    Animal cow = new Animal ("cow");
    farm.breed(cow);

    for (int i = 0; i < 10; i++) {
      dog.eat();
    }

    for (int i = 0; i <40 ; i++) {
      cow.eat();
    }

    for (int i = 0; i <30 ; i++) {
      pig.eat();
    }

    farm.slaughter();


  }
}

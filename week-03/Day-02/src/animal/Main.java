package animal;

public class Main {
  public static void main(String[] args) {
    Animal guineaPig = new Animal();
    Animal dog = new Animal();

    guineaPig.eat();
    guineaPig.eat();


    System.out.println(guineaPig.hunger);
    System.out.println(guineaPig.thirst);


    guineaPig.drink();
    guineaPig.drink();
    System.out.println(guineaPig.thirst);

    guineaPig.play();
    System.out.println(guineaPig.hunger);


  }
}

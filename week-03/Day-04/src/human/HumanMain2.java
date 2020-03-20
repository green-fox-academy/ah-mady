package human;

public class HumanMain2 {

  public static void main(String[] args) {

    Human human2 = new Human("Cini");
    System.out.println(human2.name);
    Human human3 = new Human();
    human3.name = "Cini";
    System.out.println(human3.name);
  }
}

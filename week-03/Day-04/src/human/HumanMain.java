package human;

import java.util.ArrayList;
import java.util.List;

public class HumanMain {

  //practice with Pityu during one-on-one

  public static void main(String[] args) {
    List <Human> humans = fillWithHumans();


    for (int i = 0; i < humans.size(); i+=2) {
      humans.get(i).isIll = true;
    }


    boolean isThePersonIll = true;

    int counter = 0;


    do{
      for (Human human: humans) {
        counter++;
        if (human.isIll){
          isThePersonIll = true;
          break;
        }
      }
      System.out.println(counter);
    } while (!isThePersonIll);


    while (!isThePersonIll){
      for (Human human: humans) {
        counter++;
        if (human.isIll){
          isThePersonIll = true;
          break;
        }
      }
      System.out.println(counter);
    }

    for (Human human: humans ) {
      System.out.println("The name is " + human.name + " IS he Ill? " + human.isIll);
    }

  }

  public static List <Human> fillWithHumans (){
    List <Human> humans = new ArrayList<>();
    for (int i = 0; i < 10 ; i++) {
      humans.add(new Human("Ahmed"));
    }
    return humans;
  }

}

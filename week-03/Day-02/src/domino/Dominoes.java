package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


    //not my solution


    List<Domino> orderedDominos = new ArrayList<>();

    orderedDominos.add(dominoes.get(0));
    int orderedIndex = 0;

    for (int i = 0; i <dominoes.size()  ; i++) {
      if (orderedDominos.get(orderedIndex).getRightSide() == dominoes.get(i).getLeftSide()){
        orderedDominos.add(dominoes.get(i));
        orderedIndex++;
        dominoes.remove(i);
        i= -1;
      }
    }

    for (Domino domino: orderedDominos) {
      dominoes.add(domino);
    }

    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;

  }


}

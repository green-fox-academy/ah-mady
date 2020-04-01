import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  private List<Pirate> crew = new ArrayList<>();
  Random random = new Random();

  public void fillShip(){
    crew.add(new Captain());
    int piratesNumber = random.nextInt(10)+1;

    for (int i = 0; i <piratesNumber ; i++) {
      crew.add(new Pirate());
    }
  }

  public void reportStatus(){
    Pirate captain = crew.get(0);

    if (captain.getIntoxicationCounter() >0){
      System.out.println("The captain consumed " + captain.getIntoxicationCounter()+ " rums.");

    }

    System.out.println("The captain is " + (captain.isPassOut()? "": "not ") + "passed out.");
    System.out.println("The captain is " + (captain.isDead()? "": "not ") + "dead!");

    System.out.println("There are " + calculatePiratesAlive() + " pirates alive in the ship.");
  }

  private int calculatePiratesAlive(){
    int counter = 0;
    for (Pirate pirate: crew) {
      if (!pirate.isDead()){
        counter++;
      }
    }
    return counter;
  }

  public boolean battle(Ship enemy){
    boolean thisWins = calculateScore()>enemy.calculateScore();
    int loserCrewMembers = thisWins ? enemy.crew.size() : crew.size();
    int randomLosses = random.nextInt(loserCrewMembers)+1;

    for (int i = 0; i < randomLosses; i++) {
      if (thisWins) {
        Pirate enemyToBkilled = enemy.crew.get(i);
        if (!enemyToBkilled.isDead()) {
          enemyToBkilled.die();
        }
        //enemy.crew.get(i).setDead(true);
      } else {
        Pirate pirateToBkilled = crew.get(i);
        if (!pirateToBkilled.isDead()) {
          pirateToBkilled.die();
          //crew.get(i).setDead(true);
        }
      }
    }

    if (thisWins){
      party();
    } else {
      enemy.party();
    }
    return thisWins;
  }

  private int calculateScore(){
     int piratesAlive = calculatePiratesAlive();
     int numberOFRumsTakenByCaptain = crew.get(0).getIntoxicationCounter();
     return piratesAlive - numberOFRumsTakenByCaptain;
  }

  private void party(){
    int rums = random.nextInt(11);

    while (rums>0){
      int counter = 0;
      for (Pirate pirate: crew) {
        if (!pirate.isDead()){
          pirate.drinkSomeRum();
          rums--;
        }

        if (rums ==0){
          break;
        }
      }
    }
  }
}

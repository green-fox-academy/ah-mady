import java.util.List;
import java.util.Random;

public class Pirate {

  private boolean intoxicationStatus = false;
  private int intoxicationCounter = 0;
  private boolean dead = false;
  private boolean passOut = false;


  public void setIntoxicationStatus(boolean intoxicationStatus) {
    this.intoxicationStatus = intoxicationStatus;
  }

  public boolean drinkSomeRum(){
    if (!dead){
      this.intoxicationStatus = true;
      this.intoxicationCounter++;
      return true;
    } else{
      System.out.println("he's dead");
      return false;
    }
  }

  public void howsItGoingMate(){
    if(intoxicationStatus){
      if (this.intoxicationCounter<=4 ){
        System.out.println("Pour me anudder!");
      }else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public void die(){
    this.dead = true;
    if (dead){
      setIntoxicationStatus(false);
    }
  }

/*  public boolean brawl(Pirate anotherPirate){
    if (!anotherPirate.dead){

      int randomStatus = (int)(Math.random()*99);

    }
  }*/

}

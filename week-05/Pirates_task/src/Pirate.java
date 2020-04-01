import java.util.List;
import java.util.Random;

public class Pirate {

  private boolean intoxicationStatus = false;
  private int intoxicationCounter = 0;
  private boolean dead = false;
  private boolean passOut = false;
  private Parrot parrot;


  public void setIntoxicationStatus(boolean intoxicationStatus) {
    this.intoxicationStatus = intoxicationStatus;
  }

  public boolean drinkSomeRum() {
    if (!dead) {
      this.intoxicationStatus = true;
      this.intoxicationCounter++;
      return true;
    } else {
      System.out.println("he's dead");
      return false;
    }
  }

  public void howsItGoingMate() {
    if (intoxicationStatus) {
      if (this.intoxicationCounter <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        passOut = true;
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public void sleep() {
    if (dead) {
      System.out.println("he's dead");
    }
    intoxicationCounter = 0;
    passOut = false;
  }

  public void die() {
    this.dead = true;
    if (dead) {
      setIntoxicationStatus(false);
    }
  }

  public void brawl(Pirate anotherPirate) {
    if (dead || anotherPirate.dead) {
      return;
    } else {

      Random random = new Random();
      int chance =  random.nextInt(3);

      if (chance == 0){
        dead = true;
      } else if (chance == 1){
        anotherPirate.dead = true;
      } else {
        passOut = true;
        anotherPirate.passOut = true;
      }
    }
  }

  public void addParrot(Parrot parrot){
    this.parrot = parrot;
  }

  public int getIntoxicationCounter() {
    return intoxicationCounter;
  }

  public boolean isDead() {
    return dead;
  }

  public boolean isPassOut() {
    return passOut;
  }

  public void setDead(boolean dead) {
    this.dead = dead;
  }
}

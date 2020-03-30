package aircraftCarrier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrier {

  protected List<Aircrafts> aircraftsList;
  protected int initialAmmo;
  protected int healthPoints;
  protected int storedAmmo;
  private Aircrafts aircraft;


  public Carrier(int initialAmmo, int healthPoints) {
    this.initialAmmo = initialAmmo;
    this.healthPoints = healthPoints;
    this.aircraftsList = new ArrayList<>();
    this.storedAmmo = this.initialAmmo;
  }

  public void add(Aircrafts aircrafts) {
    this.aircraftsList.add(aircrafts);
  }

  public void fill() throws Exception {
    if (this.initialAmmo == 0) {
      throw new Exception("Not enough ammo");
    } else {

      for (int i = 0; i < aircraftsList.size(); i++) {
        if(aircraftsList.get(i).isPriority()){
          this.initialAmmo = aircraftsList.get(i).refill(this.initialAmmo);
        }
      }

      for (int i = 0; i < aircraftsList.size(); i++) {
        if(!aircraftsList.get(i).isPriority()){
          this.initialAmmo = aircraftsList.get(i).refill(this.initialAmmo);
        }
      }
    }
  }

  //It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points

  public void fight(Carrier carrier){
    //aircraft.fight();
    int damage1 = 0;
    for (Aircrafts aircraft: this.aircraftsList) {
      aircraft.fight();
      damage1 = damage1 + aircraft.fight();
    }
    carrier.healthPoints = carrier.healthPoints - damage1;
    //this.healthPoints= this.healthPoints - carrier.aircraftsList.size()*carrier.aircraft.getBaseDamage();
    //DECREASE THE AMMO - PENDING
    System.out.println(carrier.healthPoints);
  }


}

/*
  It should return a string about itself and all of its aircrafts' statuses in the following format:

    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
    Aircrafts:
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    If the health points are 0 then it should return: It's dead Jim :(*/

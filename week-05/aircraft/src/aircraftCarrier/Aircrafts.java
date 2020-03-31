package aircraftCarrier;

public class Aircrafts {

  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo = 0;
  private String type;
  protected int totalDamage;


  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo() {
    this.currentAmmo = 0;
  }

  public int fight(){

    this.totalDamage = this.baseDamage * this.currentAmmo;
    this.currentAmmo = 0;
    return this.totalDamage;
  }


  public int refill(int refillAmount){
    if (refillAmount <= this.maxAmmo){
      this.currentAmmo+=refillAmount;
      return refillAmount - this.currentAmmo;
    }else {
      this.currentAmmo = this.maxAmmo;
      return refillAmount - this.maxAmmo;
    }
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType(){
    return this.type;
  }

  public String getStatus(){
    return "Type " + getType()+ ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + this. getBaseDamage()
        + ", All damage: " + fight();
  }

  public boolean isPriority(){
    if (getType() == "F35"){
      return true;
    } else {
      return false;
    }
  }



}


/*
fight
    It should use all the ammo (set it to 0) and it should return the damage it deals
    The damage dealt is calculated by multiplying the base damage by the ammunition
    refill
    It should take a number as parameter and subtract as much ammo as possible
    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
    It should return the remaining ammo
    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    getType
    It should return the type of the aircraft as a string
    getStatus
    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    isPriority
    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/

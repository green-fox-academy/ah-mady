public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();

    for (int i = 0; i < 4; i++) {
      pirate1.drinkSomeRum();
    }

    pirate1.howsItGoingMate();

    pirate1.drinkSomeRum();

    pirate1.howsItGoingMate();

    pirate1.die();

    pirate1.howsItGoingMate();

    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();

  }
}

package aircraftCarrier;

public class Main {
  public static void main(String[] args) throws Exception {
    Aircrafts jet1 = new F16();
    Aircrafts jet2 = new F35();

    //jet1.refill(100);

    Carrier carr = new Carrier(10, 1000);
    Carrier carr2 = new Carrier(20,200);


    carr.add(jet1);
    carr.add(jet2);

    carr2.add(jet1);
    carr2.add(jet2);

    carr.fill();
    carr2.fill();

    System.out.println(carr.aircraftsList.get(0).getStatus());
    System.out.println(carr.aircraftsList.get(1).getStatus());
   // System.out.println(carr.initialAmmo);

    carr.fight(carr2);
    carr2.fight(carr);

    System.out.println(carr.aircraftsList.get(0).getStatus());
    System.out.println(carr.aircraftsList.get(1).getStatus());

  }
}

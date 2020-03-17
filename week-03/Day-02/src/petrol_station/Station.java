package petrol_station;

public class Station {

  static int gasAmount = 500;

  public static void refill(Car car){
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;

  }
}

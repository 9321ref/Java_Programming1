package day31Task.CarTaskOverriding;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        super.start();
    }
    // I do not have to overriding because same implementation as superclass
}
/*
  2. Honda
  start(): "Press the brake and twist the key to ignition"

 */
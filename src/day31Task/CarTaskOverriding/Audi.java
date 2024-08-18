package day31Task.CarTaskOverriding;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price); // super keyword is calling parent class constructor
    }
    @Override// istege bagli yazmasanda olur
    public void start(){
        System.out.println("Press the start button "+ getMake()+" "+getModel());
    }
}
/*
 3. Audi
  start(): "Press the start button"
 */
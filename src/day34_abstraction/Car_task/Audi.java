package day34_abstraction.Car_task;

public class Audi extends Car implements AutoPark {

    public Audi(String model, int year, int price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi parks on its own");
    }

    @Override
    public void start() {
        System.out.println("Start with start button");
    }

    @Override
    public void drive() {
        System.out.println(" Drive fastly");
    }
}

// 8.Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface

package day34_abstraction.Car_task;

public class BMW extends Car {

    public BMW(String model, int year, int price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting loudly");
    }

    @Override
    public void drive() {
        System.out.println("Driving loudly");
    }
}

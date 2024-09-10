package day34_abstraction.Car_task;

public class Honda extends Car {

    public Honda(String model, int year, int price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting slowly");
    }

    @Override
    public void drive() {
        System.out.println("Driving slow");
    }
}
// 6.Create a Subclass of Car Named 'Honda'.
package day34_abstraction.Car_task;

public class Toyota extends Car {

    public Toyota(String model, int year, int price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting quickly");
    }

    @Override
    public void drive() {
        System.out.println("Driving smooth");
    }
}

//5. Create a Subclass of Car Named 'Toyota'.
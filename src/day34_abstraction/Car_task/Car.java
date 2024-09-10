package day34_abstraction.Car_task;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private int price;
    private String color;

    public Car(String make, String model, int year, int price, String color) {
        this.make = make == null || make.isEmpty() ? "Invalid make" : make;
        this.model = model == null || model.isEmpty() ? "Invalid model" : model;
        this.color = color == null || color.isEmpty() ? "Invalid color" : color;
        this.year = year < 1886 ? 0 : year;
        setPrice(price);
        setColor(color);
    }

    //Abstract method
    public abstract void start();

    public abstract void drive();

    // Non-Abstract method
    public void stop() {
        System.out.println(make + " is stopping");
    }

    // Non-Abstract method


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.err.println("price must not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.err.println("Color must not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }
}

/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */
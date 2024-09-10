package day34_abstraction.Transportation;

public abstract class Transportation {


    private final String make,model;
    private String color;
    private final int year;
    private double price;

    public Transportation(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        setColor(color);
        setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //abstract method
    public abstract void transportPeople();
    public abstract void start();

    //instance method because all transport stop same way(common implementation)
    public void stop(){
        System.out.println("Shut off the engine");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

/*
1. Create an abstract class named Transportation
				Variables:
					make (final), model (final), color, year(final), price

				Encapsulate all the fields

				Add a constructor that can set all the fields

				abstract methods:
					transportPeople();
					start();

				non abstract methods:
					stop(): "Shut off the engine"
					toString()
 */
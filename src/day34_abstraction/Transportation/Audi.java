package day34_abstraction.Transportation;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }


    @Override
    public void autoPark() {

    }
}

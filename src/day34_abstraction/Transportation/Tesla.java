package day34_abstraction.Transportation;

public class Tesla extends Car implements Electric,AutoPilot{

    public Tesla(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}

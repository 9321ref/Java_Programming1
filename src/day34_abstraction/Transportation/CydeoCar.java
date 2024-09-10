package day34_abstraction.Transportation;

import day34_abstraction.AnimalInterface.Flyable;
import day34_abstraction.AnimalInterface.Swimmable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot, Swimmable {

    public CydeoCar(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swimmable() {

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
}

package day34_abstraction.Device;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color) {
        super(brand, model, price, color);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the computer " + getBrand() + " " + getModel());
    }


}
/*
Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed
 */
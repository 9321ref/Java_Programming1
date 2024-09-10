package day34_abstraction.Transportation;

import day34_abstraction.AnimalInterface.Flyable;

public abstract class Plane extends Transportation implements Flyable{

    public Plane(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is landing");
    }

    public void fly(){
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}

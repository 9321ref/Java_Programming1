package day34_abstraction.Transportation;

public abstract class Car extends Transportation {

    public Car(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    public void drive(){
        System.out.println("Driving "+getMake()+" "+getModel());
    }

}

/*

	5. Create an abstract subclass of Transportation named Car

				extra methods:
					drive()

 */

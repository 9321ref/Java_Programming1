package day282930_Tasks.PhoneTask;

public class IPhone extends Phone {


    public IPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(int phoneNumber){
        System.out.println("face timing with the number " + phoneNumber);
    }
}

package day34_abstraction.AnimalInterface;

public class Duck extends Animal implements Playable,Flyable,Swimmable{


    public Duck(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    public void play(){
        System.out.println();
    }

    public void fly(){
        System.out.println();
    }

    @Override
    public void swimmable() {

    }
}

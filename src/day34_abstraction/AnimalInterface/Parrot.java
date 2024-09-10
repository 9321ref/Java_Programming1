package day34_abstraction.AnimalInterface;

public class Parrot extends Animal implements Playable, Flyable{


    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating seeds");
    }

    @Override
    public void play() {
        System.out.println();
    }

    public void fly(){
        System.out.println();    }
}

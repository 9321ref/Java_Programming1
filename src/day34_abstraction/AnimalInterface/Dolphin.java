package day34_abstraction.AnimalInterface;

public class Dolphin extends Animal implements Playable,Swimmable{

    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);

    }

    @Override
    public void eat(){
        System.out.println("Dolphin "+getName()+" is eating fish");

    }

    @Override
    public void play() {

    }


    @Override
    public void swimmable() {

    }
}

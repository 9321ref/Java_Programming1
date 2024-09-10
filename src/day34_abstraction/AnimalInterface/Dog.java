package day34_abstraction.AnimalInterface;
 //                             interface
public class Dog extends Animal implements Playable {

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println("Dog "+ getName() +" is eating dog food");
    }

    @Override
    public void play() {
        System.out.println();
    }

    public void bark(){
        System.out.println(getName() +" is barking");
    }
}

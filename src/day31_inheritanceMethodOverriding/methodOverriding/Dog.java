package day31_inheritanceMethodOverriding.methodOverriding;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + "is eating dog food");
    }


    // overriding degil cünkü parent classta olurturmdik .subclass unique methodu
    public void bark(){
        System.out.println("Dog "+ getName() + " is barking");
    }
}


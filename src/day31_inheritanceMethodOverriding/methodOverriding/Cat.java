package day31_inheritanceMethodOverriding.methodOverriding;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cats " + getName() + " is sleep 12 hours");
    }

    // overriding degil.parent class scratch methodu olustrmadik.cat subclassin unique method
    public void scratch(){
        System.out.println("Cat "+ getName()+ " is scratching");
    }

    /*
    @Override
    public void scratch(){
        System.out.println("Cat "+getName()+ " is scratching");
    // this cannot be overriding .compile error because this method is not inheritance from Parent class
    */



}

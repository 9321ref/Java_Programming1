package day35_polymorphism;

import day34_abstraction.AnimalInterface.*;
import day34_abstraction.Transportation.*;

public class PolymorphismPractice {

    public static void main(String[] args) {


        Animal tiger = new Tiger("Sher Khan", "Bengal","medium ","Orange",'M',5);

        tiger.eat();// output: Tiger Sher Khan is eating deer
        tiger.drink();// only the methods and variables in reference type can be called
        tiger.sleep();
       // tiger.hunt(); compile error Animal is not exist hunt method. Tiger object ile call yapabilrdik - Tiger tiger = new Tiger();

        Animal animal = new Eagle("Joe","American Eagle","Small","Black",'F',5);
         //animal.fly(); Animal class (reference type) doesn't have fly method
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("Joe","American Eagle","Small","Black",'F',5);
        /*
        obj1.eat();
        obj1.drink();
        obj1.sleep();
         */
        obj1.fly();
        System.out.println(obj1.canFly); // output: true

        System.out.println("--------------------------------------------------------------");
        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;


        Flyable[] birds = {parrot,eagle,};
        Swimmable[] fishes = { dolphin,shark,duck,cydeoCar};
        Playable[] friendlyAnimals = {dog,dolphin,duck,cat,parrot};

       // boolean isAnimal = cydeoCar instanceof Animal; it does not have a relationship
        boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal); //output: true

        System.out.println("----------------------------------------------------------");

        Car car = new Tesla("Tesla","Model Y",2023,"White",70000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla); // output: true
        System.out.println("isAudi = " + isAudi); // output: false
        System.out.println("isElectricCar = " + isElectricCar); // output:true
        System.out.println("hasAutoPark = " +hasAutoPark); // true
        System.out.println("hasAutoPilot = " +hasAutoPilot); // true















    }
}

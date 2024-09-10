package day35_polymorphism;

import day31Task.CarTaskOverriding.Audi;
import day31Task.CarTaskOverriding.Honda;
import day31Task.CarTaskOverriding.Tesla;

import day31_inheritanceMethodOverriding.shape_methodOverridding.Circle;

import day33_abstraction.employeeTask.*;
import day34_abstraction.AnimalInterface.*;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

      Dog dog = new Dog("Max","Husky","Small","Black",'M',3);
      Cat cat = new Cat("Jana","British","Medium","Brown",'F',3);

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;

          //Dog[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck}; //compile error~ tüm elementlerin Dog class ile iliskisi yok.sadece dog elemnetini var
         // Flyable[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck}; sadece ypüzebilen classlara reference olabilr

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck}; // all the animals are animal.because they are the child class of the Animal class

        Animal animal = new Dog("Max","Husky","Small","Black",'M',3);
        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play(); compile error Object type yani child classta olan methodu cgiramaz.sadece dog objectte has olan methodu cagirbilir.
                                            // Reference type yani parent class methoduna has olan methodlar cagrilabilr
       // animal.bark();

        System.out.println("------------------------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Teacher teacher = new Teacher("Zeynep",30,"Z12",'F',4000,"Teacher");

        Tester tester = new Tester("Refianur",30,"R21",'F',5000,"Tester");

        Driver driver = new Driver("Cevdet",60,"C18",'M',5000,"Driver");

        Developer developer = new Developer("Ahmet",33,"A23",'M',6000,"Developer","Java");


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver,tester}; //

        System.out.println(Arrays.toString(objects));

        Employee[] employees = {teacher,developer,driver,tester };

        Employee obj = new Driver("Cevdet",60,"C18",'M',5000,"Driver");
        obj.work();

        System.out.println("----------------------------------------------------------------------");







    }
}

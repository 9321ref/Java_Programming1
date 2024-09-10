package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day34_abstraction.Transportation.AutoPilot;
import day34_abstraction.Transportation.Electric;
import day34_abstraction.Transportation.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();

        //Cat cat = new Dog(); compile error

        Animal animal = (Animal) new Dog(); // implicit casting -> up casting,casting the subtype to super type (done implicitly).(Animal) yazmaya gerek yok

        System.out.println("--------------------------------------------");

        Animal animal1 = new Dog();
        animal1.setInfo("Max","Husky",'M',4,"Large","White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog)animal1).bark(); // down casting
       /*
        Dog dog1 = (Dog)animal1; // down casting
        dog1.bark();

        */

      //  ((Cat)animal1).scratch(); Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat

        System.out.println("-----------------------------------------------------------------");

        Phone phone = new Nokia("XR20","Small","Blue",3500);

        phone.call(1323442425);
        phone.text(255353535);
        ((Nokia)phone).selfDefense(); //Phone super classta böyle bi özellik yok.sub class'a casting yaparak selfDefense methodunu kullancaz

      //  ( (IPhone) phone).faceTime(1535355353); //ClassCastException -> Nokia can not be converted to Iphone,because there is not "IS A " relationship between Nokia and IPhone
        System.out.println("-------------------------------------------------------------------");

        Employee employee = new Developer("Ahmet",33,"A23",'M',6000,"Developer","Java");

        employee.work();

        System.out.println( ((Developer) employee).getProgrammingLanguage()); // ProgrammingLanguage fields get methodunu cagirabilmek icin Developer object casting yaptik.Down casting

      //  Driver driver = (Driver) employee; -> ' ClassCastException '= employee -Developer- is not a relationship between Driver.
                                               //  is a relationship olmasi icin inheritance olmasi lazim


        Electric electric = new Tesla("Tesla","Model Y",2020,"Blue",55000);
        // 1. Upcasting: casting the subtype to super type (done implicitly)  -> (Electric)new Tesla

        electric.charge();
        ((Tesla)electric).selfDrive(); // tesla methodu bu nedenle
        ((AutoPilot) electric).selfDrive();

        System.out.println("-------------------------------------------------------------------------");

        Employee employee1 = new Teacher("Zeynep",30,"Z12",'F',4000,"Teacher");

        Employee employee2 = new Tester("Refianur",30,"R21",'F',5000,"Tester");

        Employee employee3 = new Driver("Cevdet",60,"C18",'M',5000,"Driver");

        Employee employee4 = new Developer("Ahmet",33,"A23",'M',6000,"Developer","Java");


        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();


    }
}


/*
2. Reference Type Castings: THERE MUST BE INHERITANCE

			  1. Upcasting: casting the subtype to super type (done implicitly)

			  			Car car	= new BMW(); -> (Car)new BMW(); implicitly

			  2. Down-casting: casting the super type to sub type (done explicitly)

 */
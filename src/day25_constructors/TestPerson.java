package day25_constructors;

import day12_customsMethods.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestPerson {

    public static void main(String[] args) {


        Person p1 = new Person("Refianur",30,'F',LocalDate.of(1993,10,21),false,false);
        Person p2 = new Person("Enes",29,'F',LocalDate.of(1995, 2,16),false,false);


        System.out.println(p1);
        System.out.println(p2);

        p1.drink("Tea");
        p1.eat("fruit");
        p1.sleeping(LocalTime.of(22,30));

        p2.drink("Tea");
        p2.eat("Kaju");
        p2.sleeping(LocalTime.of(0,30));



    }
}

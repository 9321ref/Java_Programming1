package day25_constructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirthday;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOfBirthday, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirthday = dateOfBirthday;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirthday=" + dateOfBirthday +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", dateOfBirthday=" + dateOfBirthday.format(DateTimeFormatter.ofPattern("MM/dd/y"))+
                '}';
    }

    public void eat(String food){
        System.out.println(name + " is eating " +food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink );
    }

    public void sleeping(LocalTime timeOfSleep){
        System.out.println(name + " is sleeping " + timeOfSleep);
    }
}



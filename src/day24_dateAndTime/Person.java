package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name; // instance method -- attribute
    public int age;
    public char gender;
    public LocalDate dateOfBirth;



    // setInfo --Constructor

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }




    // simdi ki tarihten dogum yilini cikarirsa yasi bulur.
        // this age yapmadik cünküyukarda local variable olarak yazmadik
        // gerek duymadk dgum gününü blirsek localdate ile yasini bulabilirz



    @Override
    public String toString() {
        return "CustomClassPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


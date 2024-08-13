package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person("",27,'M',LocalDate.of(1995,02,16));
        person.setName("refia");
        System.out.println(person.getName());

    }
}

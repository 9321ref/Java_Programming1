package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Refianur",'F', LocalDate.of(1993,10,21),'A',"A21");
        President president = new President("Max",'M',LocalDate.of(1955,12,23),LocalDate.of(2020,01,21));
        Teacher teacher = new Teacher("Nurefsan",'F',LocalDate.of(1990,12,30),"Sdet","Re12",5500);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("....................................................");

        student.eat("Baklava");
        teacher.drink("Tea");
        president.drink("Coffee");


    }
}

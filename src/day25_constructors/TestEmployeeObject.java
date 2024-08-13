package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ali",28,'M',"Java Developer",10000, LocalDate.of(2022,3,23));

        Employee e2 = new Employee("Refinur",30,'F',"STED",5000,LocalDate.of(2025,02,10));

        System.out.println(e1);
        System.out.println(e2);
    }


}

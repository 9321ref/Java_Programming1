package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M',LocalDate.of(1991, 1, 12));
        System.out.println(person);

        person.breath();

        Employee employee = new Employee("Reafinur",'F',LocalDate.of(1993,10,21),"Tester",5000);

        System.out.println(employee);

        employee.breath();
    }
}






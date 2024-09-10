package day35_polymorphism;

import day33_abstraction.employeeTask.*;

public class PolymorphismPractice3 {

    public static void main(String[] args) {


        Employee[] employees = {
                new Teacher("Zeynep", 30, "Z12", 'F', 4000, "Teacher"),
                new Tester("Refianur", 30, "R21", 'F', 9000, "Tester"),
                new Developer("Ahmet", 33, "A23", 'M', 7000, "Developer", "Java"),
                new Teacher("Lina", 30, "Z12", 'F', 4000, "Teacher"),
                new Tester("Nur", 30, "R21", 'F', 3000, "Tester"),
                new Developer("Mike", 33, "A23", 'M', 3000, "Developer", "Java"),
                new Driver("Cevdet", 60, "C18", 'M', 5000, "Driver"),

        };

        //  1. Print the name and Job Title of every employee
        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }

        System.out.println("---------------------------------------------------------------");

        int countDeveloper = 0,
                countTester = 0,
                countDriver = 0,
                countTeacher = 0;

        for (Employee each : employees) {

            if (each instanceof Developer) { // if the employee is Developer
                countDeveloper++;
            } else if (each instanceof Tester){ // if the employee is Tester
                countTester++;
            } else if (each instanceof Teacher){ //if the employee is Teacher
                countTeacher++;
            }else{
                countDriver++;
            }

        }
        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTester = " + countTester);
        System.out.println("countTeacher = " + countTeacher);
        System.out.println("countDriver = " + countDriver);
        /* output:
        countDeveloper = 2
        countTester = 2
        countTeacher = 2
        countDriver = 1
         */

        System.out.println("-----------------------------------------------------------------");

        for(Employee each : employees){
            if(!(each instanceof Developer)){ //if the employee who is not Developer
                System.out.println(each.getName());
            }
        }


    }
}
/*
 1. Print the name and Job Title of every employee
        2. How many developers do we have?
        3. How many testers do we have?
        4. How many teachers do we have?
        5. How many Drivers do we have?
        6. Display the names of employees who are not developers
 */
package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class A1_ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        // 1.1 Write a program that can display the name and job title of each employee

        for (Employee each : employees) { // String Integer olmaz cunku Arraylist icinde sadece Employee Object kabul ediyor

            //   System.out.println(each); tüm bilgiler geldi
            System.out.println(each.name + ":" + each.JobTitle);

        }

        System.out.println("--------------------------------------------------------------");

        // 1.2 Write a program that can display the names of "Java Developers"

        for (Employee each : employees) {
            if (each.JobTitle.equals("Java Developer")) ; // String compare with equals method.
            // if the job title of the employee is Jva Developer
            System.out.println(each.name); // prints the name of the employee --> Josh, Bella
        }

        System.out.println("------------------------------------------------------------");

       // 1.3 Write a program that can display the maximum and minimum salary

        double max = employees.get(0).salary; // get()--> for Object / current max starts from 0 to compare each salary
        double min = employees.get(0).salary;

        for(Employee each : employees){
            if(each.salary > max){ // compare each salary with current max number
                max = each.salary; // each salary (greater salary) assign to the variable max.
            }

            if(each.salary < min){
                min = each.salary;

            }
        }
        System.out.println("max Salary is = " + max); //max Salary is = 130000.0
        System.out.println("min Salary is = " + min); //min Salary is = 90000.0


        System.out.println("----------------------------------------------------------");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for(Employee each : employees){
            if(each.gender == 'M'){ // compare char to another char we use "=="  equal operator
                maleEmployees.add(each);
            }else{
                femaleEmployees.add(each);
            }
        }
        System.out.println("Total number of female employees: "+ femaleEmployees.size()); //2
        System.out.println("Total number of male employees: "+ maleEmployees.size()); //3


    }

}
/*
	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a program that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists

 */
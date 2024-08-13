package day12_customsMethods;

public class Salary {

    public static void main(String[] args) {

         salary(45,40);




    }

    public static void salary(double hourlyRate, int weeklyHours) {

        double totalSalary = hourlyRate * weeklyHours * 52;

        System.out.println("You make " + hourlyRate + " per hour\nyou work " + weeklyHours + " in a week\nyour gross income is " + totalSalary);


    }




}
/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */
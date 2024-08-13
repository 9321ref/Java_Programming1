package day14_forLoopAndOverLoading;

public class SalaryCalculator {

    public static void main(String[] args) {


       double income =  salary(45,40);
        System.out.println(income);
        // or

        System.out.println(salary(45,40)); // 93600.0


    }

    public static double salary(double hourlyRate, int weeklyHours){
        return hourlyRate * weeklyHours * 52 ;
    }


}







/*


2. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */
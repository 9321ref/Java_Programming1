package day03_variable;

public class EmployeeInfo {
    public static void main(String[] args) {

       /* System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("Aaron");

        System.out.println("_______________________");

        String name ="Aaron";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name); */

        String employeeName = "Daniel";
        int age = 35;
        char gender = 'M';
        String companyName = "Google Inc",
                employeeId = "A19",
                jobTitle = "Java Developer";
        int salary = 11000;
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        // write texts on the console with title form   age : 26 ~ name: Daniel
        System.out.println("_________________________________");
        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);

        System.out.println("_______________________________________");
      // SECOND way to right

        String student_Name = "Nora";
        String school_Name = "MIT";
        String student_Id = "C25";

        int age1= 26;
        char gender1 = 'f';  // one character represent ''
        double gpa1 = 3.8;
        boolean isFullTime1 = true;

        System.out.println("student_Name = " + student_Name);
        System.out.println("school_Name = " + school_Name);
        System.out.println("student_Id = " + student_Id);
        System.out.println("gender1 = " + gender1);
        System.out.println("gpa1 = " + gpa1);
        System.out.println("isFullTime = " + isFullTime);






    }


}

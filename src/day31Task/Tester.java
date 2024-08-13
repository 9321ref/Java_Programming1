package day31Task;

public class Tester extends Employee {


    public Tester(String name, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, age, employeeId, jobTitle, companyName, salary);
    }

    public void work(){
        super.work();
        System.out.println("is testing");

    }
}
/*
3. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */

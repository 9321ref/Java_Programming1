package day33_abstraction.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, String id, char gender, double salary, String jobTitle) {
        super(name, age, id, gender, salary, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+ " is testing the application");
    }
}

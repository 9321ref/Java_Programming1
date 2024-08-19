package day33_abstraction.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, String id, char gender, double salary, String jobTitle) {
        super(name, age, id, gender, salary, jobTitle);
    }

    public void work(){
        System.out.println(getName() +" is driving ");
    }
}

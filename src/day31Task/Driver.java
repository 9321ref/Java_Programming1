package day31Task;

public class Driver extends Employee {

    public Driver(String name, int age, String employeeId, String companyName, double salary) {
        super(name, age, employeeId, "Driver", companyName, salary);
    }

    public void work(){
        System.out.println(getName()+ " is driving");
    }
}

/*

3. Create the following subclasses of Employee:
        2.4 Driver:
        - work(): Displays "[name] is driving".
*/
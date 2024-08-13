package day31Task;

public class Teacher extends Employee{


    public Teacher(String name, int age, String employeeId, String companyName, double salary) {
        super(name, age, employeeId, "Teacher", companyName, salary);
    }

    public void work(){
        System.out.println(getName()+ " is teaching");
    }
}
/*
3. Create the following subclasses of Employee:
        2.3 Teacher:
        - work(): Displays "[name] is teaching".
*/
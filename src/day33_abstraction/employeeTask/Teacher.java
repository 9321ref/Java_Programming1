package day33_abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, String id, char gender, double salary, String jobTitle) {
        super(name, age, id, gender, salary, jobTitle);
    }

    public void work(){
        System.out.println(getName()+ " is teaching");
      // overridden method from abstract class.Parent class' abstract methods must be override in child (non-abstract) class
    }//override olmazsa extends combile error verir. because parent class must be implemented
}

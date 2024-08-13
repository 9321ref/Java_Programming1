package day26_statics.customClassTaks;

public class EmployeeClientsTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Enes",28,'M',"Java Developer", 6000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Hasan",34,'M',"Sdet",6500);
        System.out.println(employee2);

        employee1.work();
        employee2.work();

    }
}

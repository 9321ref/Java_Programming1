package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        //  Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);
        // We cannot create objects from an abstract class, Object MUST be created from a concrete(somut) class
        // An abstract class cannot be instantiated

        Teacher teacher = new Teacher("Zeynep",30,"Z12",'F',4000,"Teacher");

        Tester tester = new Tester("Refianur",30,"R21",'F',5000,"Tester");

        Driver driver = new Driver("Cevdet",60,"C18",'M',5000,"Driver");

        Developer developer = new Developer("Ahmet",33,"A23",'M',6000,"Developer","Java");
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(developer);

        teacher.work();
        tester.work();
        driver.work();
        developer.work();
    }
}

package day31Task;

public class EmployeeClients {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Zeynep",30,"Z12","Mohammad ALFateh",6000);

        Tester tester = new Tester("Refianur",31,"Re11","Tester","Mercedes",5000);

        Developer developer = new Developer("Ahmet",34,"A23","Bosch",8000,"Java");

        Driver driver = new Driver("Cevdet",63,"C21","Mercedes",4000);

        System.out.println(teacher);
        teacher.work();

        System.out.println(tester);
        tester.work();

        System.out.println(developer);
        developer.work();

        System.out.println(driver);
        driver.work();

    }
}

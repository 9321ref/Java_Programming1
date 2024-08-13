package day17_customClass;

public class EmployeeObjectsTest {

    public static void main(String[] args) {

 //              object name
//    class name reference name
        Employee employee1 = new Employee();
        employee1.setInfo("Refianur",30,'F',"SDET",4500,"R21");

        Employee employee2 = new Employee();
        employee2.setInfo("Hasan",34,'M',"SDET",5000,"H15");

        Employee employee3 = new Employee();
        employee3.setInfo("Nurefsan",24,'F',"Grafik Designer",4500,"N16");


        // when you reassign value

        employee3.age = 25; // 24  -> 25 change the object on console

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);



        // Instance Method call from Class
        employee3.work();  // instances methods  Nurefsan is working
        employee2.work();  // instance method Hasan is working
    }
}



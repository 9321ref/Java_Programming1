package day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();
      //  employee1.salary = -200000; classtan private ile drek cagiramazsin

        employee1.setSalary(18888);
        System.out.println(employee1.getSalary());

      //  employee1.setName("     ");  // yukarda salary -188888 rakam olursa setName calismiyor
        System.out.println(employee1.getName());
 */

        Employee employee1 = new Employee("Enes",-27,"Developer",80000);

       // System.out.println(employee1); // bütün condition dogru olursa println error vermez.mesele maas -80000 olursa err verir
        System.out.println(employee1.getAge());


    }
}

package day28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
      //  student.age = -200; age ,student class icinden ulasamiyor instance variable public degilde, private oldgu icin

      //  System.out.println( student.age);

        // student.setAge(-25); // yasi yazdirmak icin method
        student.setAge(30);

        System.out.println( student.getAge());


        //student.setName("Refianur444");

        System.out.println(student.getName());





    }
}

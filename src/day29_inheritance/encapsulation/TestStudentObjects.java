package day29_inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Refianur",30,'F',"Yale",'A');

        System.out.println(student1.getAge());

        student1.setName("ENES");
        System.out.println(student1.getName());

        System.out.println(student1);
    }
}

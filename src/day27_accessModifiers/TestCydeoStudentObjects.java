package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Refianur" ,30 ,'F');
        CydeoStudent student2 = new CydeoStudent("Maria", 38,'F');

        System.out.println(student1);
        System.out.println(student2);
/*
        System.out.println(student1.schoolName); // static call through object name that is not good way
        System.out.println(student1.secretCode);

        System.out.println(student2.schoolName);
        System.out.println(student2.secretCode);

 */
    }
}

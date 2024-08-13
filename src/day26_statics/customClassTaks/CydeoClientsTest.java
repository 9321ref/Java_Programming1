package day26_statics.customClassTaks;

public class CydeoClientsTest {

    public static void main(String[] args) {

        CydeoStudents students1 = new CydeoStudents("Naile",38,"N12",'A',36,2);
        CydeoStudents students2 = new CydeoStudents("Maria",38,"M13",'A',36,1);
        CydeoStudents students3 = new CydeoStudents("Refianur",30,"R14",'A',36,2);

        System.out.println(students1);
        System.out.println(students2);
        System.out.println(students3);

        students1.study();
        students2.study();
        students3.study();

       // Do not call the static through Object:Static should be call with class Name "CydeoStudents"

       CydeoStudents.printSchoolName();
       CydeoStudents.printProgrammingLanguage();

    }

}

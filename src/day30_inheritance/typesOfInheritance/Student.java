package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {

    private char grade;
    private String studentId;

    //subclass constructors
    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB); // person class ait oldgu icin direk fields kullanamayz super ile cagirabilriz.Person classin constructor kendi sinif adiyla kullanamadgmiz icin´´
        setGrade(grade);   //aslinda this ile yazilir.ama private old icin instance variable set methodu kullaniyrz.this ile olmasinin nedeni subclass'a özel oldgu icin direk kullanabilirz
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName() +" is studying ");
    }
}

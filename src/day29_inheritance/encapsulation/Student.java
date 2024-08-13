package day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String schoolName;
    private char grade;

    public Student(String name, int age,char gender,String schoolName,char grade){
        setName(name);
        setAge(age);
        setGender(gender);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getName() { // READ only
    /*
        if( name == null){
            name ="Unknown";
        }
     */
        return name;
    }

    public void setName(String name) { // WRITE only
    /*
        if(name.isEmpty()) {
            System.err.println("Invalid name");
            //return;
            System.exit(1);
        }
     */
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if (age < 5 || age > 90) {
            System.out.println("Invalid student age " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender: " + gender);
            System.exit(1);
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (isValid) {
            this.grade = grade;
        } else {
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }
    }

    public String getSchoolName () {
            return schoolName;
        }

    public void setSchoolName(String schoolName){
            this.schoolName = schoolName;
        }

    public void study(){
        System.out.println(name +"is studying at "+schoolName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}// eger constructor tam bi sekilde olusturduysak toStringte get(name) get(age) yapmaya gerek yok


 //******* INTERVIEW SORUSU SETTER VE GETTER METHOD NASIL YAZILIR ******
/*
Warmup tasks:
    1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fields (at least encapsulate two fields manually)
                    requirements:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any character other than: 'M' and 'F'
                        3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirements of fields in the above must be applied)


            Methods:
                study()
                toString()
 */
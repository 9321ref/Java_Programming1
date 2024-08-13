package day25_constructors.StudentTask;

public class Student {

    //Instance Variable
    public String name ;
    public int age;
    public char gender;
    public String id;


    //Initialize instance variable
    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying " );
    }


}

/*
Warmup tasks:
	1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */
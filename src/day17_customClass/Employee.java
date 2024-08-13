package day17_customClass;

public class Employee {

    //------6 instance variables------
    public String name;
    public int age;
    public char gender;
    public String JobTitle;
    public double salary;
    public String id;


    // ----three instance method----
              // burayi setInfo yaz
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        JobTitle = jobTitle;
        this.salary = salary;
        this.id = id;

    }// sets all the attributes of the Employee object at once


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    } // to avoid getting hash code when we print employee object


    // instance method
    public void work(){
        System.out.println(name +" is working");
    }


}

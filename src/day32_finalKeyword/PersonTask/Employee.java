package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitle ; // jobtitle changeable that is why without a final keyword
    private double salary;

    public Employee(String name, char gender,LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender,  dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName() +" is working");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth()+
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



    }



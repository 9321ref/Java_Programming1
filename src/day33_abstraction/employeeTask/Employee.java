package day33_abstraction.employeeTask;
// inheritance class icin ne gecerliyse abstract icin gecerli
public abstract class Employee { // parent class gibi görev yapan ama abstract classtir.concrete olan somut alt siniflar bu siniftan miras alir.somut siniflar tarafindan genisletilerek tamamlanir
//final ve abstract asla yanyana olamaz.abstract ile object olusturlmaz.alt siniflarla olustrulur
    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee( String name,int age, String id, char gender, double salary, String jobTitle) {

        setName(name);
        setAge(age);
        setId(id);
        setGender(gender);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work(); // abstract method can only be created in an abstract class
                             // abstract method (uncompleted method).it is completed by child class (subclass)

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
EmployeeTask

	Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();
 */
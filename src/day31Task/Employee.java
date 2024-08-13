package day31Task;

public class Employee extends Person {

    private String employeeId;
    private String jobTitle ,companyName;
    private double salary;

    public Employee(String name, int age,String employeeId, String jobTitle, String companyName, double salary) {
        super(name,age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary <= 0){
            System.out.println(" Salary can not be zero or negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+ " " + getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation of All the fields.
       Condition:
            Salary cannot be zero or negative

   Add a constructor to initialize all fields.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.

 */
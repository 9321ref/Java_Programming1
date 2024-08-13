package day31Task;

public class Developer extends Employee{

    private String programmingLanguage;


    public Developer(String name, int age, String employeeId, String companyName, double salary, String programmingLanguage) {
        super(name, age, employeeId,"Developer" , companyName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        super.work();
        System.out.println("is coding in "+ programmingLanguage);
    }
}
/*
3. Create the following subclasses of Employee:
   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

 */
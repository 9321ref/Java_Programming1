package day33_abstraction.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;


    public Developer(String name, int age, String id, char gender, double salary, String jobTitle, String programmingLanguage) {
        super(name, age, id, gender, salary, jobTitle);
        setProgrammingLanguage(programmingLanguage);
    }




    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle()+ " is coding in " +programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}" ,"") +
                "programmingLanguage='" + getProgrammingLanguage() +
                '}';
    }
}

package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Person {

    private String name; // ismi changeable istyoruz bu yüzden final koymadik.
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;


    public static final int numberOfHead; // static final variable, execute ypabilmek icin static block kullndik

    static {
        numberOfHead = 1;
    }

    //constructor icinde sadece private final instance variables set yapabilirz.final stop value change
    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if(!(gender =='M' || gender == 'F')){   // setter methodu olmadgi icin final keyword kullaninca, setter burada constructor icinde yapmak zorundayz
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender; // final olunca setter olmaz.cannot be modified

        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }

    // finl yazdiktan snra okunabilmesi icin constructor kullanilir instance variable icin



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(name+ "is eating");
    }

    public void drink(){
        System.out.println(name+ "is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public final void breath(){
        System.out.println(name +" is breathing");// to make sure that this implementation will not change for any subclass
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


//+++++++++++++++++  IF the instance variable is final, we can only getter, we can not generate setter for it
/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead
Methods:
    eat(), drink(), sleep()
    breath()
 */
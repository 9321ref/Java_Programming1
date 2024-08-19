package day32_finalKeyword;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;  //I have to initialize final instance variable before create the object or before we use them .therefore need constructor
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage ;

    /*
    Constructor: Bir nesne oluşturulurken gerekli başlangıç değerlerini atamak için kullanılır.
    final instance variable'ları ilk kez atamak için de kullanılır.
     */
    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth); // constructor call always comes the first step
        if(getAge() < 18 ){ //if age is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id; // It is initialized in constructor
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }
    /*
    static block: static değişkenleri başlatmak için kullanılır ve sınıf yüklendiğinde bir kez çalışır.
     */
    static {
        programmingLanguage = "Java";
    }

    // id setter olmaz cünkü eleman atandiktan sonra degismez
    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        } else { // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }
    }

    public void setBatchNumber(int batchNumber) {

        if(batchNumber <= 0){
            System.out.println("Invalid batch number: "+batchNumber+"\nBatch number can not to be zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}


/*

1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables

 */
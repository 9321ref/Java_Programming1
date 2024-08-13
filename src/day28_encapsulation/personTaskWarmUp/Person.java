package day28_encapsulation.personTaskWarmUp;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings,numberOfHeads;

    public Person(String name){ // Allows us to create Person object just by setting the name of  the person
        this.name = name;  //constructor da olan name'i ,this.name olan instance variable assing ediyor. iki name ayni sey deil

    }

    public Person(String name,int age){ // Allows us to create Person object just by setting the name & age of person
        this(name); // constructor can call only one time
        this.age = age;
    }

    public Person(String name, int age, String language){ // Allows us to create Person object just by setting the name & language of the person
        this(name);
        this.language = language;

    }

    public Person(String name, int age, char gender) {
        this(name,age);
       // this(name,age); bi taneden fayla constructor cagramazsin
        this.gender = gender;
    }

    public Person(String name,int age,char gender,String language){ // Allows us to create Person object just by setting the name,age,gender and language of the person
        this(name, age, gender);
        this.language = language;
    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 0;
        numberOfWings = 0;
        // static block accepts only static method
    }


    public static void PrintPlanetName(){ //  bu method static degilde,instance method da olabilirdi.instance olsaydi her seferinde object create etmek cagirabilmek icin.
                                         // Object memory kaplar,memory de resource,recource da cost yani para
                                        //static daha hizli ve daha kullanisli
        System.out.println("Planet name is : " + planet);
    }

    public void eat(String food){ //burada static olmaz cünkü instance variable olan name kullancaz.instance variable static methodda cagiramayiz "name" gbi
        System.out.println(name +" is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name +" is drinking "+ drink);
    }

    @Override
    public String toString() { // toString method is instance method and accepts static method .toString method can modifier
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*

Custom Class:
	1. Class & Object
	2. Instance Variables & instance methods
	3. Statics (Static Variables, Static Methods, static Block)
	4. Constructor


static vs instance:
	one copy vs multiple copies
 */
/*
Warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()


 */
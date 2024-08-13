package day28_encapsulation.personTaskWarmUp;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Enes");
        Person person2 = new Person("Refianur",30);
        Person person3 = new Person("Hasan",34,'M');
        Person person4 = new Person("Nurefsan",24,'F',"Türkisch");

        person2.name = "Refia nur";
      //person3.planet = "Mars";  we can call static through instance method but not choose
      // Person.planet = "Mars"; // bütün hepsi Mars olur


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Person.PrintPlanetName();

        person1.eat("Fish");
        person1.drink("black tea");

        person3.eat("Brownie");
        person3.drink("Coffee");

    }
}

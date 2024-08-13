package day17_customClass;

public class DogObjectTest {

    public static void main(String[] args) {

       Dog dog1 = new Dog(); // new Dog object must have stored, String, int olmaz cünkü String class degil,Dog clsss

       dog1.name = "Max";
       dog1.breed = "Husky";
       dog1.gender = 'M';
       dog1.age = 4;
       dog1.size = "Large";
       dog1.color ="Gray";



        Dog dog2 = new Dog();

        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 3;
        dog2.size = "Small";
        dog2.color ="Orange";


        Dog dog3 = new Dog();
        dog3.setInfo("Loki","Chow chow",'M',3,"Medium","Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Jana","Bulldog",'F',4,"small","white");




        System.out.println(dog1); //First you need to specify this print method on custom class with return type String -toString-
                                  // if you do not specify with toString method ,object it will print # ... like error
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog1.eat();  // when I run "Max is eating" if I delete the text above ,this code default -null- is eating
        dog2.drink();
        dog3.drink();
    }
}

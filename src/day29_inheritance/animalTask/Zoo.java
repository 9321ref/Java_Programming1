package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Jana","British",'F',2,"Medium","Brown");

        Tiger tiger = new Tiger();
        tiger.setInfo("mex","hilk",'M',4,"Large","Black");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        System.out.println("--------------------------------------------------------------");

        dog.bark();
     //   dog.meow();
     //   dog.hunt();

        tiger.hunt();
        //tiger.meow();

        System.out.println("---------------------------------------------------------------");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());



        dog.setGender('F');
        dog.setAge(8);
        System.out.println(dog);

        System.out.println(cat);


    }


}

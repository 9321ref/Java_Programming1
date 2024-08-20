package day31_inheritanceMethodOverriding.methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Jana","British","Medium","Brown", 'F',3);

        Dog dog = new Dog("Max","Husky","Small","Black",'M',2);

        Lion lion = new Lion("Simba", "African Lion","Large","Yellow",'F', 5,true);

        Eagle eagle = new Eagle("Bella","American Eagle","Large","Black",'M',6);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------------------------------------------------------------");

        //we created one eat method but each object just different implementation to eat() method of the Animal.1 method has 4 implementations
        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();
        
        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();
    }
}

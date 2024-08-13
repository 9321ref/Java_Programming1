package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*
    {
       name = "James";  // -> every object default name James. you can not assign any argument, parameters in the instance block {}
       age = 20; // -> every object default age 20
       // if you want to write each instance variable separately then better choose is Constructors
    }
     */
    public InstanceInitializationBlock(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Enes",28);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

package day27_accessModifiers;

public class TestCarNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car Object

        Car.CasEngine obj2 = obj1.new CasEngine(); // this is how create inner class --> CarEngine Object ( firstly we have to create Car Object
                              // without Car object we can not have CarEngine Object)

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();


    }

}

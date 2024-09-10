package day36_polymorphism;


public class TestEqualMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false -> two objects not equal because they are located two different allocation in the heap memory
        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1.equals(circle3)); // false

        System.out.println("--------------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple","IPhone12", "Large","Black",2500);
        IPhone iphone2 = new IPhone("Apple","IPhone13", "Large","Black",2500);

        System.out.println(iphone1.equals(iphone2));
    }
}

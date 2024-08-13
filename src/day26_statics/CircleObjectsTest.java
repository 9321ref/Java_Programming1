package day26_statics;

public class CircleObjectsTest {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
/*
        // we can call any static members through the Object 'circle2'
        //because objects they do share whatever class has.Objects came form the  class
        //pi is static
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        that is not good option
 */
        //right way is that can be call the static member through Class name 'Circle'
        System.out.println(Circle.pi);
        //radius belongs to the Object.and Class can not share what class has.CLASS it can not access Object members
      //  System.out.println(Circle.radius);

    }
}

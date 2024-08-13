package day25_constructors;

public class TestRectangleObject {

    public static void main(String[] args) {

 /*
    Rectangle rectangle1 = new Rectangle();
    rectangle1.setInfo(3,4);

    Rectangle rectangle2 = new Rectangle();
    rectangle2.setInfo(4,6);

    Rectangle rectangle3 = new Rectangle();
    rectangle3.setInfo(5,6);

    Rectangle rectangle4 = new Rectangle();
    rectangle4.setInfo(6,3);
*/
        //Object without setInfo
        Rectangle rectangle1 = new Rectangle(4,7);
        Rectangle rectangle2 = new Rectangle(6,8);
        Rectangle rectangle3 = new Rectangle(5,4);



        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);


    }


}

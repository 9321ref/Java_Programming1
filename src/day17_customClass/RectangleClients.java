package day17_customClass;

public class RectangleClients {

    public static void main(String[] args) {

      Rectangle rectangle1 = new Rectangle();

      rectangle1.width = 4.5;
      rectangle1.length = 5.5;
        System.out.println(rectangle1); //Rectangle{width=4.5, length=5.5}

      Rectangle rectangle2 = new Rectangle();

      rectangle2.width = 2.5;
      rectangle2.length= 3.5;
        System.out.println(rectangle2);//Rectangle{width=2.5, length=3.5}

        System.out.println(rectangle1.calculateArea());// 24.75
        System.out.println(rectangle1.calculatePerimeter());// 18.0

        System.out.println(rectangle2.calculateArea()); // 8.75
        System.out.println(rectangle2.calculatePerimeter()); // 10.0
    }

}

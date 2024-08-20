package day33_abstraction.shapeTask;

public class TestShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle",5);

        System.out.println(circle);
        circle.area();

        Rectangle rectangle = new Rectangle("Rectangle",4,5);
        System.out.println(rectangle);
        rectangle.area();
        rectangle.draw();
        rectangle.perimeter();

        Square square = new Square("Square",7);
        System.out.println(square);
        square.area();
        square.perimeter();
        square.draw();

    }
}

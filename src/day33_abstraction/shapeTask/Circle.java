package day33_abstraction.shapeTask;

import java.text.DecimalFormat;

public class Circle extends Shape{

    private double radius;

    public static double pi = 3.14;

    public Circle(String shape, double radius) {
        super(shape);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2* pi * radius;
    }

    @Override
    public void draw() {

    }

    public double area(){
        return pi * radius;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString().replace("}" ,"")+
                ",radius=" + radius +
                ",area=" + df.format(area()) +
                ",perimeter=" + df.format(perimeter()) +
                '}';
    }
}

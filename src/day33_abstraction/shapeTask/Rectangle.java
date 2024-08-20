package day33_abstraction.shapeTask;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

    private double length,width;

    public Rectangle(String shape, double length, double width) {
        super(shape);
        setLength(length);
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }


    public void draw(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getClass().getSimpleName()+"{" +
                "length=" + length +
                ", width=" + width +
                ",area=" + df.format(area()) +
                ",perimeter=" + df.format(perimeter()) +
                '}';

    }
}

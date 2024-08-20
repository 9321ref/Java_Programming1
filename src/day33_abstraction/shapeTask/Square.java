package day33_abstraction.shapeTask;

import java.text.DecimalFormat;

public class Square extends Shape{

    private double side;

    public Square(String shape, double side) {
        super(shape);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void draw() {

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public double area(){
        return side * side;
    }

    public double perimeter(){
        return  4* side;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString().replace("}" ,"")+
                "side=" + side +
                ",area=" + df.format(area()) +
                ",perimeter=" + df.format(perimeter()) +
                '}';
    }
}

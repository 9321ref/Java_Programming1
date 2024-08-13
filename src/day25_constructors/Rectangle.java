package day25_constructors;

public class Rectangle {

    public double length, width;  // instance variable -- attributes

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
        public  void setInfo(double length,double width){
            this.length = length;
            this.width = width;


        }
    */
    public double area() { // instance method -- return type is double
         return length * width;
    }

    @Override
    public String toString() {
        return "A4_Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}

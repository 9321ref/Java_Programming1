package day31_inheritanceMethodOverriding.shape_methodOverridding;

public class Square extends Shape{

    private double side;
    // burada neden compile error yok.cünkü parent classta default constructor olurturduk. subclass icine implicitly constructor arka planda olusturuyor


    public Square(double side) {  // -> side square has bi özellik old icin,side icin cons olusturduk
      //  super(); buna gerek yok parent class icinde default const ile implicitly olustruldu
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw(); // shape parent classtaki kural buraya cagrilcak
        System.out.println("\t* * * * *");

        for (int i = 0; i < 4; i++) {
            System.out.println("\t*       *");
        }
        System.out.println("\t* * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                "side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

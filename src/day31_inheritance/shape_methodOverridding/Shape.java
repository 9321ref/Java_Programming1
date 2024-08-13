package day31_inheritance.shape_methodOverridding;

public class Shape {

    private String name;

    public Shape() {   //-> default constructor  .
        setName(getClass().getSimpleName());  //hangi sekli yazarsam yazayim bu medodla class ismiyle yazilcak circle rectangle..
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;  // 0 verdik cünkü actigimz subclass göre orada methodu yazicaz .circle ise ona göre rectangle ise ona göre
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("Drawing a "+ getClass().getSimpleName()+": ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

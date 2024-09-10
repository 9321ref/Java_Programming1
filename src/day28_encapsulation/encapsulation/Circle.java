package day28_encapsulation.encapsulation;

import java.text.DecimalFormat;

public class Circle {

    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if( radius <= 0 ){
            System.out.println("The radius cannot be set to a negative or zero value");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return Math.PI * radius*radius; // alani -> area A= PI*r²

    }
    public double calcPerimeter(){
        return 2* Math.PI *radius;  // yari capi -> perimeter c = 2* PI*radius
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                "area=" + df.format(calcArea()) +
                "perimeter=" +df.format(calcPerimeter()) +

                '}';
    }
}
/*
Constructor kullanmamızın başlıca sebepleri şunlardır:

Nesneyi Başlatmak (Initialize): Constructor, sınıfın yeni bir örneği oluşturulduğunda (örneğin new Circle() kullanarak) nesnenin durumunu (state) başlatır.
Bu, üye değişkenlere başlangıç değerleri atamak anlamına gelir.
Örneğin, radius değişkenine bir başlangıç değeri vermek için constructor kullanılır.

Zorunlu Bilgileri Almak: Constructor, bir nesnenin oluşturulması sırasında gerekli olan bilgileri almayı sağlar. Örneğin,
Circle sınıfını oluştururken radius bilgisi olmadan bir Circle nesnesi anlamlı olmaz.
Constructor bu bilgiyi alarak nesneyi tam ve geçerli bir durumda başlatır.
 */


/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

 */
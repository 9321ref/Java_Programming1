package day27_accessModifiers;

public class Car { //outer class , it can not be static

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CasEngine { //inner -> burada sadece outer class members kullanabilirsn.
        //** inner class is instance of Car object(outer class)

        public void method() {

            System.out.println(make);
            System.out.println(wheels);
        }
    }

        public static class StaticInnerClass{ // inner class can be static

           public void method(){
              // System.out.println(make); static not accepts instance
               System.out.println(wheels);
        }


    }// nested class oluyor.outer class olmadan inner class olmaz.outer class members getrmek icin inner icinde 'instance method' yazdik
}

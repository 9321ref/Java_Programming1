package day22_arrayList;

public class A1WrapperClasses {

    public static void main(String[] args){

        int b1 = 100;
        long b3 = 100;

        double c1 = b1;
        long c2 = b1; // implicitly casting to the primitive type

        Integer b2 = b1; //I can assign primitive value to the integer --> auto boxing
        Long b4 = b3;

       // Long b3 = b1; error / assing edemezsin b1 int primitive type .int primitive converts only to Integer Wrapper class Object
       // Double b4 = b1;  error

        char ch = 'A';

        Character b5 = ch; //Autoboxing

        double d1 = 5.5;

        Double d3 = d1;// "Double" wrapper class and assign double variable

        System.out.println("---------------------- Unboxing ---------------------");

        Integer n1 = 20; // wrapper class object convert into primitive

        int n2 = n1; // UNBOXING
        /*
         integer objecti ,long double ... primitive value' a assign yaptiginda error vermiyor ama en güzeli kendi cinsine assing yapmak
         long n3 = n1;
         double n4 = n1;
         */

        Character e1 = 'Z';

        char e2 = e1; // Unboxing  / implicitly (automatically) converting

       //int e3 = e1;
        //long e4 = e1;









    }
}

package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //------Implicit Casting------

        byte a = 15;  // smaller type to larger type
        short b = a;
        //short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting ~ 'a' is a byte smaller primitive type, assigned to int (larger type)

        long d = 3000L; // from int type to long type (assign) converting with L

        float f = d; // implicit type


       //------Explicit Casting------

        int x = 100;

        byte y = (byte)x;

        System.out.println(y);

        float z = 20.8f;

        short q = (short)z; // z = 20.8 ~short cast just 20, because '20.8' is not integer number.

        System.out.println(q);

        double n1 = 2.5;
       // byte n2 = n1; compiler error because double type to byte can not assign (large -> small cannot)

        byte n2 = (byte) n1;  // n1 = 2.5; n2 = 2 because byte is integer num.

        System.out.println(n2);

        System.out.println("______________________________");

        int num =  500;

        byte result = (byte)num; // explicit casting

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        System.out.println("______________________________");

        double u = 3000.5;

        int p = (int)u; // explicit number

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1); // d1 is decimal that's why 100.0








    }
}

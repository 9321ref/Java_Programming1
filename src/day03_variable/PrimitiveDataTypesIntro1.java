package day03_variable;

public class PrimitiveDataTypesIntro1 {

    public static void main(String[] args) {

           // DataType  variableName = Data;
          // byte a = "Java";  // byte Only accepts integer value -128 ~ 127
         // byte a = 20.5;   //  byte can not take decimal numbers
        // byte a = 2000;  //  out of Byte range (-128 ~ 127)
        byte a = 20;

        // price of the car is $17500

        short p = 17500;

        System.out.println("p");   //  " p"  call variable name
        System.out.println(p);    //  p call  Variable Data


        // salary is $95000

        int s = 95000;  // preferred

        System.out.println(s);

       // int n = 99999999999;    // out of integer
        long n = 9999999999L;  //

        //  gpa is 3.5

        double gpa1 = 3.5; // preferred data types for all the decimal numbers
        float gpa2 = 3.5F; // now assign a float number

        double gpa3 = 3.5;
        System.out.println(gpa3);  //  " p"  call variable name
                                   //  p call  Variable Data
        System.out.println("gpa");

    }


}

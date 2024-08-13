package utilities;

//import day26_statics.Data; Classta ki bütün veriyi getrmek icin
import static day27_accessModifiers.Data.d; // cok memory kaplamamasi icin tek tek bu seklde cagrilir

import static day27_accessModifiers.Data.method3;

import static  day27_accessModifiers.Data.*; //bütün static methodu getirirmek istersen

public class Test2 {

    public static void main(String[] args) {

       // System.out.println(Data.d);

      //import static day26_statics.Data.d;
        System.out.println(d);

      //import static day26_statics.Data.method3; -> imports one static member from a class
        method3();

       // import static  day26_statics.Data.*; -> import all the static members from class

        System.out.println(e);
        System.out.println(f);

        method4();

/*   instance variable static importla yazdirilmaz
        System.out.println(a);
        System.out.println(b);

        method1();
        method2();
 */



    }
}

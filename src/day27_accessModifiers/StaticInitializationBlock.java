package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    static {

        a = 100;
        b = 20.5;
        c = "Java";

        // Genellikle sınıfın statik değişkenlerini başlatmak veya yükleme işlemleri yapmak için kullanılır.
        // initialize static variables you can use only static block.best choose is initializing the static is static block.

        //for instance variable, best choose is Constructor for initializing
    }

/*
    public static void main(String[] args) {

        a = 100;
        b = 20.5;
        c = "Java";
    }
   you should not be used ANY method to initialize the static variables
 */

//     public StaticInitializationBlock(){ // --> constructors
//
//         a = 100;
//         b = 20.5;
//         c = "Java";
//     }//Constructor cannot be executed through the Class name directly.Only execute when you create the Object.but it is not a good option
//      // new StaticInitializationBlock();
//     //there for static never should initialize with constructor
// }

}
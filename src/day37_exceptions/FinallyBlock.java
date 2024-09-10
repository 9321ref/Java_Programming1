package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {


        try{
            System.out.println( 9 /0 );
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            //  System.exit(1); // eger final block gecmeden durdurmak istersek bunu yazarsin
        }finally {  // catch block handle olsun olmasin yinede excute olur
            System.out.println("Finally Block");
        }

        System.out.println("------------------------------------------");


    }
}

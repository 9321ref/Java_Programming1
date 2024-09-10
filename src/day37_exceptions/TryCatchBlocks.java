package day37_exceptions;

import java.io.IOException;
import java.util.Locale;

public class TryCatchBlocks {

    public static void main(String[] args) {



        //handle exception
        /*
        try bloğu, Java'da potansiyel olarak hata (istisna) oluşturabilecek kodları yazdığınız yerdir.
        try bloğu içinde bir istisna (exception) meydana geldiğinde,
        bu istisna catch blokları tarafından yakalanır ve işlenir.
         */

        System.out.println("Program1 started");

        try {
            System.out.println(9 / 0); // exception will terminate code -
            System.out.println("Try Block");
        }catch(ArithmeticException e){ // buradaki exception hangi exception ise o olmali yoksa problemi neye göre cözecegini bilmiyor ve exception vermeye devam eder
                                       //try block taki kod ile  catch block exception uyumlu olmali.bu sekilde handle edebiliriz. try->9/0 catch -> arithmetic
            System.out.println("Catch Block");
        }

        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------");


        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){ // -> Exception Throwable ücüde olur. unchecked exception
            System.out.println("Catch Block"); // when runtime exc. happens, java will catch it and assigns to a variable in catch block
        }

        System.out.println("Program2 ended");

        System.out.println("---------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);  // checked exception
            System.out.println("Try Block"); // hangi block ta  exception handle olursa onu console yazar
        }catch (InterruptedException e){
            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");

    }
}

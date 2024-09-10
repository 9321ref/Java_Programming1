package day37_exceptions;

import day36_Tasks.Pizza;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        // Unchecked Exceptions have relationship with RuntimeException(parent class)
        // exception oldgu zaman kodu durduruyor altinda yazilan kodlar dogruda olsa calismiyor(top the bottom)
        String str = "Java";

        //char ch = str.charAt(250); // 'unchecked exceptions'. compile ederken problem yok sadece runtime da bug old ortaya cikiyor
        //System.out.println(ch);

        Pizza pizza = null; // null keyword is not object and cannot execute
      // pizza.calcCost();  // 'unchecked exception' ,because it is occurred during the run time .
                          // null does not reference any object at all -> you will get (nullPointerException)


      // System.out.println(50/0); // unchecked exception matematikte 50 '0' bölünmez.compile error vermiyor ama during run time da exception verir(ArithmeticException)

        System.out.println("-------------------------------------------------------------");

        int score = 100;
        if(score > 59){
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }
        // her bug exception deildir bazen runtime ve compile time sirasinda bug bulunmaz ama mantiksal hata vardir yukarda if örneginde old gbi
        // bug yanlis sonuclar vermesidir kodun veya yanlislik dkkat eksiklik sonucu olusur
        //Exception, programın çalışması sırasında beklenmedik bir durum ortaya çıktığında fırlatılan bir uyarıdır
        //Örneğin, bir programda bir sayıyı sıfıra bölmeye çalıştığınızda bir exception ortaya çıkar.
        // Bu durumda, program "Division by zero" (sıfıra bölme) exception'ı fırlatarak hatayı bildirir ve normal akışını durdurur.
        //source da mevcut olmayan kodlardir .bazen yazilimci belirli kosul saglandiginda exception kullanir islemin durmasi icin


        System.out.println("-----------------------------------------------------------------------");

        //Checked Exceptions do NOT have is a relationship with RunTimeException class
       // FileInputStream file = new FileInputStream(""); // Checked exception -> unwanted exception during compile time

       // Thread.sleep(3000); // Checked exception



    }




}

package day38_exceptions_handling;

import utilities.Library;

import java.time.LocalTime;

public class Test {

    //main method sorumlu handle ypmaya .cünkü utilitide ki library de gecici cözüm thrown kullanilidgi icin.
    //eger library de try catch block kullanilsa burada rahat kullanilabilir

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        // Thread.sleep(3500);
        Library.sleep(3.5);

        System.out.println("How are you today?");

        if (LocalTime.now().equals(LocalTime.of(3, 0))) {
            throw new BreakTimeException();
        }

       // throw new RuntimeException("Something went wrong");
        //throw new BreakTimeException("it is time to go home"); //extend edilmedigi icin error.BreakTimeException classta tanimlanmadi böyle kod
         throw new BreakTimeException("It is time to go");  //(String message)

    }
}

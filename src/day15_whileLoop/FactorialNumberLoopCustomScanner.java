package day15_whileLoop;

import java.util.Scanner;

public class FactorialNumberLoopCustomScanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int factorial =  factorial(num); // buraya sayi verdiginde bug veriyor. parametre ye yazdigini vernce consoleda istedgini yazabilirsn
        System.out.println(factorial);
    }
                                   //bu parametrenin faktöriyelini hesapalar
       public static int factorial(int num){

        int result = 1; // faktöriyeli  1 den baslatirz .parametre de olan num sayisina kadar sirayla carpariz

           for (int i = 1; i <= num ; i++) {
                           //parametre
               result *= i;
           }

        return result;

    }
}

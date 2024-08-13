package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number"); // I'm  gonna ask for user decimal number
        float num1 = input.nextFloat(); // I get the value form user as a float because I assign above - decimal number -#

        System.out.println("Enter your second decimal number:");
        double num2 = input.nextDouble();

        System.out.println("Enter true or False:");
        boolean r = input.nextBoolean();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

        input.close();


        /*
        ou can write on console 10 but  result it will be 10.0 as a float
        you doesn't get any error. because  implicitly will be cast by float type .y
         */
    }
}

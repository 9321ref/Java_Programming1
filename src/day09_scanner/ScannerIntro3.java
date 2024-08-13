package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:  ");

        char ch = input.next().charAt(0);

       // System.out.println("You have entered :  " +ch);

        System.out.println("Would you like to continue?");

        String answer = input.next(); //  next() method execute till space ,it doesn't contain or execute whole sentence

       // String answer = input.nextLine(); // nextLine() method execute all sentence until the new line -look at the console-
                                             // write what you want,and you will see that you write like a result
        System.out.println("You have entered:" + answer);

       input.close();



    }
}

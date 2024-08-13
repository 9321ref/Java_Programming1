package day09_scanner;

import java.util.Scanner;

// import java.util.*;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // for reading user inputs   <- scanner object created, this class are connecting still keyword
                                                                                 //after executing has to object close

        System.out.println("Enter your first number:"); // execute yaptiktan snra consele da assign yapip enter ypman yoksa
                                                        // asagida ki tanima gecmiyor. tanimlanana kadar veriyi bekliyor

        byte num1 = input.nextByte();  // -128 ~ 127

        System.out.println("Enter your second number:");

        short num2 = input.nextShort();

        System.out.println("Enter your third number:");

        int num3= input.nextInt();

        System.out.println("Enter your fourth number:");

        long num4 = input.nextLong();

        input.close();   //scanner is closed, can not read user inputs again .
                         //it is not mandatory to write just you know it connects with keyword


        /* System.out.println("Enter your fifth number:");  //bu code okunmaz cünkü scanner kapandi ,diger scanner hala calisiyor demek
        int num5 = input.nextInt();

        */

        System.out.println("First number = " + num1);
        System.out.println("Second number= " + num2);
        System.out.println("Third = " + num3);
        System.out.println("Fourth = " + num4);
      //  System.out.println("Fifth = " + num5);


    }
}
  /*
  import statement: used for importing one java file to another

  regular import : imports one single class from the specified package
       import package.className

  wild import : imports everything form the package
       import package.*;
   */
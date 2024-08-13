package day12_customsMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter first name: ");
        String first = input.nextLine().trim().replace(" ", ""); // ....... A  L e N A   --> Alena
        // trim(0 & replace() methods will make sure that the white spaces & additionals spaces between the characters will be removed
        // eger console uzun voslukla yazarsan trim console daki boslugu siliyor
        //   ............... cydeo --> cydeodan önceki boslugu siliyor

        System.out.println("Enter last name:");
        String last = input.nextLine().trim().replace(" ","");//  ......... El  hADi ja .... --> Elhadija

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
                 //"c"     "C"   getting first character of first name +  the remaining characters of the first name


        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first +" "+last;

        System.out.println(fullName);


    }

}
/*
Warmup tasks:
	1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */
package day11_stringMethod;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();



        if(str.length() >=1 ) { // if the string has at least one character when you count character it starts from 1
            // length it is not going to index number , going to return total number of the character

            char f = str.charAt(0); // the first character of string ~ index start from zero~ string icinde sadece 1 var oda index olarak 0 olur

            if (f >= '0' && f <= '9') { // at the ascii table just digit numbers are from 48 to 57. bu rakamlarin character karsiligi from '0' to '9'
                System.out.println("first character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("print first character is special character");
            }

        }else{
            System.out.println("String is empty");
        }







    }
}

/*
3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table



 */
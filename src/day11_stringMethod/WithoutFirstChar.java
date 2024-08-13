package day11_stringMethod;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");

        String word1 = input.next();

        System.out.println("Enter second word");

        String word2 = input.next();

        String result = word1.substring(1)+word2.substring(1);

        System.out.println(result);




    }
}





/*
4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

 */
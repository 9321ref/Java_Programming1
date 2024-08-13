package day11_stringMethod;

import java.util.Scanner;

public class CombinesWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord = input.nextLine();

        System.out.println("Enter second word");
        String secondWord = input.next();

        String result = firstWord + secondWord.substring(1);
        System.out.println(result);








    }
}

/*
5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */
package day14_forLoopAndOverLoading;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int sum = 0;

        for (int i = 0; i < 5; i++) { // in the java starts index number from 0

            System.out.println("Enter a number"); // 1 -10
            sum += input.nextInt(); ;
        }


        System.out.println("sum = " + sum); //1+...5 =15





        //write a program that can ask the user enter to enter a number for five times,  print the maximum number

    }


}

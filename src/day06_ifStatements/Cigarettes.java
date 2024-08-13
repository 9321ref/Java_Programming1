package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 18;

        if (age >= 21 && age < 100){
            System.out.println("You are eligible to buy cigarettes"); // bu iki kosul biri yanlissa statement console yazmadi
        }                                                             // && her ikisi ya dogru ya yanlis olmali

        if( age < 21 || age > 100 ) {
            System.out.println("You are not eligible to buy cigarettes"); // bu iki kosuldan biri dogruysa statement console aktarilir
        }                                                                 // || ya biri dgru ya biri yanlis olacak demk ,sarti karsilyorsa
                                                                          // console aktarilir


    }
}


/*

1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
 */
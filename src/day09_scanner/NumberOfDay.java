package day09_scanner;

import java.util.Scanner;

public class NumberOfDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people the live with you");
        int people = input.nextInt();

        input.close();

        if(people> 3 && people<=6){
            System.out.println("Live with less than 3 people");
        }else if(3<=people && people<=6){
            System.out.println("live with 3 - 6 people");
        }else if(people>6){
            System.out.println("Live with more than 6 people");
        }





    }
}




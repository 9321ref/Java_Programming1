package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // i need just one input from user

        System.out.println("Enter the day number");

        //int num = new Scanner(System.in).nextInt(); -> bu scanner input acmadan tüm tanimlamayi yapma sekli
                                                        //hem variable hem scanner object ve method -nextInt()- bi arada yazma sekli

        int num = input.nextInt();

        String day = "Invalid";

        if(num >= 1&& num <= 7){

            day = (num==1 )? "Monday":(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday"
                    :(num==5)? "Friday" :(num==6)? "Saturday" : "Sunday";
        }

        System.out.println(day);

        input.close();

        // you should write valid on the console,after call the value from the variable .if the number isn't between 1~7
        // then executed the value Invalid






    }
}

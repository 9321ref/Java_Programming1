package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVoteWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid 1 ~ 120

        while ( ! ( age >= 1 && age <= 120)  ){ // while the age is not valid

            System.err.println("Invalid Entry; Please re-enter your age:"); // while condition'a  uydugu sürece invalid yazmaya devam eder
            age = input.nextInt(); // how can I use entry ? or get input you need to use scanner method and call scanners input method to get age


        }

        System.out.println("Are you a US citizen? Yes/N"); // maybe ,idk istedgi cevap vermeynce srekli statement devam eder taki yes or no dyene kadr
        String yesOrNo = input.next().toLowerCase();

        while ( ! (yesOrNo.equals("yes") || yesOrNo.equals("no") ) ){ // while the answer is neither yes or nor

            System.err.println("Invalid Entry!Please re-enter "); // err error message denir.
            System.err.println("Are you a US citizen ? Yes/No");
            yesOrNo = input.next().toLowerCase();

        }

        if ( age > 21 && yesOrNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        input.close();
    }

}

package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) { // 6 kac kez tekrarlanacgi
            System.out.println("hello" +i);  // i yazdi cünkü arttigni gsteryor
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("hello "+i);
        }

        System.out.println("-----------------------------------");

// while genelde ve dgru olan known nubmbers time icin kullanilir

        int j = 0;  // j benim while condition icin
        while(j < 5){
            System.out.println("Hello "+j);
            j++;  // as for loop iteration
    }
        System.out.println("-----------------------------------------");


        int k = 0;
        do {
            System.out.println("hello " +k);
            k++;
        }while(k < 5);

        System.out.println("--------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while (score > 100 || score < 0){
            System.out.println("Invalid score , re-enter your score"); // eger ki sonuc bu aralikta deilse sürekli invalid verr
            score=input.nextInt();                                  // bu contion disinda bi deger vernce if statement gecer
        }


        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}

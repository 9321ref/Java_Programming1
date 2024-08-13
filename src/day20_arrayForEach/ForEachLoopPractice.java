package day20_arrayForEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        // DataType must match with the successive(ardisik) values of the data structure
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int each : numbers) {
            System.out.println(each);

            if (each % 2 == 0) {
                System.out.println(each);
            }

        }

        System.out.println("------------------------------------------------");

        int[] numbers2 = {100, 20, 30, 40, 50, 5, 4, 3, 2, 1000, 300, 500};

        int max = numbers[0]; // henüz bilmedigimiz icin 0 degeri veriyoruz array icinde
        int min = numbers2[0];

        for (int each : numbers2) {
            if (each > max) {   // each -> any number ,max-> current numbers
                max = each;
            }
            if (each < min) {
                min = each;

            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0; // k -> index

        for (int each : a1){
            a3[k++] = each;
        }

        for (int each : a2){
            a3[k++]= each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("---------------------------------------------------");

        String[] names = {"Refia Nur", "Muaz Hasan", "Enes Malik", "Meryem Betül"};

        for(String each : names) {
            System.out.println(each.charAt(0) +"."+ each.charAt(each.lastIndexOf(" ")+1)); //R.N M.H

        }

    }
}
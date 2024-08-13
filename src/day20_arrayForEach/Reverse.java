package day20_arrayForEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
          reverse[j] = array[i]; // j degiskenin reverse dizisinde hangi indekse eleman kopyalacagini belirtir.
            // 0 dan baslayarak artar , bu da tersine cevrilen dizinin basindan sonuna dogru sirali bir sekilde dldurulmasini saglar
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("-----------------------------------------------------------");

        int[]nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reverse(nums); //reverse Utility class ta öncedn olustrulmus method cagiryor yeni variable kullanabilyorm

        System.out.println(Arrays.toString(nums)); //[500, 400, 300, 200, 100]

        System.out.println("------------------------------------------------------------");

        double[] a1 = {1.5, 2.5, 3.5, 4.5, 5.5};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1)); // [5.5, 4.5, 3.5, 2.5, 1.5]

    }
}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

 */
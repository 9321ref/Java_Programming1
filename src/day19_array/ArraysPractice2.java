package day19_array;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        int[] arr1 = new int[100];
/*
        for (int i = 0, j = 1; i < arr1.length; i++, j++) { // i -> 0 ~ 100 index number of array / j -> elements of array
            arr1[i] = j; // each element will take index number of array.[1, 2, 3, 4,.... 100]

            for (int i = 0, j = 10; i < arr1.length; i++, j+=10 ) { // 10' ar artar
            arr1[i] = j ;
*/

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = i+1;  // i: 0 index +1 = 1, 1 index +1 =2, 2index +1 = 3... -> 1, 2, 3,......100
            }

        System.out.println("arr1: " + Arrays.toString(arr1) ); // arrays print yapmak icin 'Arrays.toString()'

        System.out.println("---------------------------------------------------");

        int[] arr2 = new int[100]; // index: 0 ~ 99
/*
      There is pattern : belirli düzene kurala göre tekrarlanan dizi
        for (int i =0, j = 100; i < arr2.length; i++, j--) { // 100 den 1/ i: index num. increase at same time j: number of elements decrease
            arr2[i] = j;

        }
*/
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 -i;// 100 den geriye giderken 1 eksilt

        }

        System.out.println( "arr2: "+ Arrays.toString(arr2));
        }


    }


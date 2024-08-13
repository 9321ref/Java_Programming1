package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        //index of elements : 0    1   2     0   1   2   3   4     0   1
        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} }; // 2 dimensional array
        //index of 1D Array:    0                  1                  2


  //...................... NESTED LOOP .......................
        for (int i = 0; i < arr2D.length; i++) {  // i: index number of 1D array in arr2D

            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString( each1D));

            for (int j = 0; j < each1D.length; j++) { // j: index number of elements in each 1D array of arr2D

                int eachElement = each1D[j];

                System.out.println(eachElement); // to get each element from arr2D

                // System.out.println(Arrays.toString( arr2D[i] ) );
            }

        }
        System.out.println("1-------------------------------------------------");

// second way : this one easy and  practical
        for( int[] each1Darray : arr2D ){

            System.out.println(Arrays.toString(each1Darray));

            for( int eachElement : each1Darray ){
                System.out.println(eachElement);

            }
        }
        System.out.println("2---------------------- REVERSE ------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) { //index number of each single dimensional array from the arr2D (0 ~ 2)
            for (int j = arr2D[i].length - 1; j >= 0; j--) { // index number of each element from the one  dimensional array (her bir arrayin icinde ki elementi bulur)

                System.out.println(arr2D[i][j]); // 100, 90 ....... 10

            }

        }

        System.out.println("3----------------------  FOR EACH LOOP  ------------------------");
//for each loop ile bastan sona kadar yazdirabilirsin. ama sondan basa (reverse)  for loop ile yazdirlir

        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement); // 10, 20 ........ 100

            }

        }







    }
}
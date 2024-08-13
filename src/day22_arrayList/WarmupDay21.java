package day22_arrayList;

public class WarmupDay21 {

    public static void main(String[]args) {

       // Write a program that can find the minimum and maximum numbers from a two-dimensional array of integers

     //index of element    0    1   2      0    1    2
       int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} }; //two-dimensional array length is 3
       //index of 1D array       0            1                 2          //indexes of array: 0~2

        int max = array[0][0]; // assume max number ,I do not know yet
        int min = array[0][0]; // her hangi bir index of 1D ve index of element verdik henüz bilmiyoruz

        for( int[] each1D: array ){ // one dimensional array form two-dimensional array / access for each array from beginning to end
            for (int eachElement : each1D) { // access from each1D every each element

                if(eachElement > max){
                   max = eachElement;
                }
                if(eachElement < min){
                    min = eachElement;
                }
            }

        }
        System.out.println("maximum number is = " + max);
        System.out.println("minimum number is = " + min);


    }

}


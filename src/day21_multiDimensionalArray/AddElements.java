package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array,array.length +1);
        new_array[new_array.length-1] = element; // Yeni array'in son elemanını, element değişkeninin değeri olan 6 olarak atıyoruz.

        System.out.println(Arrays.toString(new_array));//[1, 2, 3, 4, 5, 0]

        System.out.println("1 -----------------------------------------------------");

        // // call method from Array Utility
        int[] numbers = {100,90,80,70,60};

        numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("2 -----------------------------------------------------");


        // call method from Array Utility
        double[] nums = {1.5,2.5,3.5,4.5};

        nums = ArraysUtility.addElement(nums,5.5);
        nums = ArraysUtility.addElement(nums,7.5);
        nums = ArraysUtility.addElement(nums,8.9); // every new elements, must create new array object
                                                          //size of array is fixed
        System.out.println(Arrays.toString(nums));

        System.out.println("3 -----------------------------------------------------");

        String[] students = {"Yasin","Mustafa","Enes Malik","Ahmet"};

        students = ArraysUtility.addElement(students,"Enes");
        students = ArraysUtility.addElement(students,"Cemal");

        System.out.println(Arrays.toString(students));








    }
}

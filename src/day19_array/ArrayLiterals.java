package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        //two ways that can be  instantiating. elementleri biliyorsam ikincisi terch edilen .büyük rakamlar icin birincisi mantikli
        int[] numbers = new int[5];
        int[] nums = {10,20, 30, 40, 50}; // Array Literal 'heap memory'

        System.out.println(numbers.length); // 5
        System.out.println(nums.length); // 5

        System.out.println("numbers =" + Arrays.toString(numbers) ); //numbers =[0, 0, 0, 0, 0]
        System.out.println("nums =" + Arrays.toString(nums));//nums =[10, 20, 30, 40, 50]

        System.out.println("----------------------------------------------------");

        //elements:         1         2           3            4          5          6           7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0         1           2             3          4          5          6
        int n = 1;
        System.out.println( days[n-1]);// index 0 dan basladigi icin


        //int index = 0;
        //System.out.println( days[index]);

        System.out.println("-------------------------------------------------------------");

        String[] month = {"January", "February", "March", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", " Dec"};

        /*
        month = new String[12];
        month[0] = "January";
        ...
        ...
         */

        System.out.println("month = " + Arrays.toString(month) );


        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);

        }

    }
}

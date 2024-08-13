package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // allocated in the heap 'every single object'

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum = 0; // any numbers add it 0,it is going to return me that number itself

        for (int i = 0; i < total ; i++) {

            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = sum / (double)total; // decimal olacagi icin double casting yapti.
                                              // Average numbers: sayilarin toplaminin ortalamasini almak.
                                              //ex: iki sinifn notalrinin ortalamasini alarak basarili sinif secmek

        //decimal yazdirirken sifirlarin yazdirma yuvarlma. bazen cok ondalik oluyor sayida bunu daha net rakama cevirir bu method(rounding)
        DecimalFormat df = new DecimalFormat("0.00");



        System.out.println("Numbers:" +Arrays.toString(numbers)); //[1,2,3,4,5]
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));
    }
}

/*
5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */
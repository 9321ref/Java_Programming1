package day20_arrayForEach;

import java.util.Arrays;

public class MultipleOddNumbersArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // array literal mutable change

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2 == 0){
                continue;  // if divisible by 2, skip it and multiply each odd num ( (1*2)2, 2, (3*2)6, 4, (5*2)10, 6,...
            }                                                                     //   [2, 2, 6, 4, 6...18, 10]
            numbers[i] = numbers[i] * 2;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]
 */
package day19_array;

public class MaxNumber {

    public static void main(String[] args) {
        
        int[] numbers = {100, 20, 500, 40, -10, 30};
        
        int max = numbers[0]; // index number of array 0 --> 100.'100' is just assumption to compare remain numbers

        for (int i = 1; i < numbers.length; i++) { // i: started from 1, because 0(100) is my max num. 1, 2, 3, 4, 5

            if (numbers[i] > max){ // 20 > 100 false, 500 > 100 true, 40 > 500 false...compares the element of the array with current max num
                max = numbers[i];// max = 100, max = 500, max = 500....max = 500 replace the current mx num
            }

        }
        System.out.println("max = " + max);
    }
}

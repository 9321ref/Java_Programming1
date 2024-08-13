package day19_array;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int min = numbers[0]; // assume that first element is the min number

        for (int i = 1; i < numbers.length; i++) { // i: started from 1, because 0(100) is my max num. 1, 2, 3, 4..

            if (numbers[i] < min){ //compares the element of the array with current min num
                min = numbers[i];//  replace the current min num
            }

        }
        System.out.println("min = " + min); // -10
    }
}




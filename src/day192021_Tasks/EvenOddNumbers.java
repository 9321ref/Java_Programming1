package day192021_Tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {

      //int[] numbers = new int[7];

        int[] nums = {1, 2, 3, 4, 5, 6, 7,8,9};
        int even = 0;
        int odd = 0;

        for (int eachNumber : nums) {

            if (eachNumber % 2 == 0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println("The array has "+ even +" even numbers and "+ odd + " odd numbers");


    }
}
/*
Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */
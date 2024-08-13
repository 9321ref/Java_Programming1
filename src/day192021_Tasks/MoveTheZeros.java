package day192021_Tasks;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] move = new int[array.length];
        System.out.println(Arrays.toString(move)); // [0, 0 , 0 , 0 ,0 ,0]

        for (int i = 0 , y = 0; i < array.length; i++) {
            if (array[i] != 0) {
                move[y++] = array[i];


            }
        }
        System.out.println(Arrays.toString(move));
    }
}

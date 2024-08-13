package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A5_MoveTheZeros {

    public static void main(String[] args) {

        ArrayList<Integer> moveZero = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int zero = Collections.frequency(moveZero,0); // kac tane sifir oldgunu buldu
        moveZero.removeAll(Arrays.asList(0));

        for(int i = 0; i < zero; i++){
            moveZero.add(0);
        }
        System.out.println(moveZero);


    }
}


/*

5. Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]

 */
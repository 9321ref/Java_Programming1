package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class A3_DuplicatesElements {
    public static void main(String[] args) {

        ArrayList<Integer> duplicate = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int size = duplicate.size();
        for(int i = 0; i < size ; i++){
            duplicate.add(duplicate.get(i) );
        }
        System.out.println(duplicate);
    }

}
/*
yukarda int size acikliyor
  //Eğer bir değişken döngü içinde tanımlanırsa
 // her döngü turunda bu değişken sıfırlanır veya yeniden atanır.
// Bu, değişkenin her seferinde yeniden yaratıldığı anlamına gelir.

Eğer bir değişken döngü dışında tanımlanırsa, bu değişkenin değeri her döngü turunda korunur ve değişmez.
 */

/*
3. Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */
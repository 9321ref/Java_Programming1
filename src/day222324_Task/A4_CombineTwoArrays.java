package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4_CombineTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> combineLetters = new ArrayList<>();
        combineLetters.addAll(Arrays.asList(arr1));
        combineLetters.addAll(Arrays.asList(arr2));

        System.out.println(combineLetters);


        //Second Way
       // String[] arr1 = {"A", "B", "C"};
       // String[] arr2 = {"D", "E", "F", "G"};

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add((arr2[i]));
        }
        System.out.println(list);
    }


}


/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
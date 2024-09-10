package day39_collection.Task;

import java.util.*;

public class Task2_MergeList {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        Set<Integer> uniqueNums = new LinkedHashSet<>();
        uniqueNums.addAll(list1);
        uniqueNums.addAll(list2);

        System.out.println(uniqueNums);



    }
}
/*

2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list.
Ensure that the third list contains no duplicate elements and maintains the original (insertion)order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
 */
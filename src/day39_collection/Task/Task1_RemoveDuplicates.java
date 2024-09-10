package day39_collection.Task;

import java.util.*;

public class Task1_RemoveDuplicates {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(set);

        System.out.println("----------------------------------------------------");

        //second solution
        List<Integer> nums = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        Set<Integer> unique = new TreeSet<>(nums);
        System.out.println(unique);



    }
}
/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

Example:
        {20, 15, 10, 20, 30, 10, 20, 15, 0}

Output:
        {0, 10, 15, 20, 30}

 */
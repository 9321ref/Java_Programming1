package day39_collection.Task;

import java.util.*;

public class Task5_Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split(""))); //keeps the sorted order, does not accept null,not allow duplicate
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2) ? "true" : "false");

        System.out.println("---------------------------------------------------------");

        String str3 = "xyze";
        String str4 = "xyzd";

        Set<String> set3 = new HashSet<>(Arrays.asList(str3.split("")));
        Set<String> set4 = new HashSet<>(Arrays.asList(str4.split("")));

        System.out.println(set3);//[e, x, y, z]
        System.out.println(set4);//[d, x, y, z]

        System.out.println(set3.equals(set4) ? "true" : "false"); // false



    }

}





/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
 considering only the distinct characters(different) in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false

 */
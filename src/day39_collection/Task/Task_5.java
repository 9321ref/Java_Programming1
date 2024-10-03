package day39_collection.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));
        System.out.println(list);

        Iterator<String> it = list.iterator();


    }
}


/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings.
 The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */
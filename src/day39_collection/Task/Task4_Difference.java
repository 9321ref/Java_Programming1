package day39_collection.Task;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4_Difference {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));

        Set<Integer> differenceElements = new TreeSet<>();

        for(Integer each : set1) {
            if(!(set2.contains(each))) {
                differenceElements.add(each);
            }
        }
        System.out.println(differenceElements);

        System.out.println("solution2-----------------------------------------------");


        Set<Integer> nums1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> nums2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));

        Set<Integer> difference = new LinkedHashSet<>();
        difference.addAll(nums1); //1, 2, 3, 5
        difference.removeAll(nums2); // difference list icinde olan num2 ile ayni olan cikar yani 2,3 cikar ( 1,5 ) kalir

        System.out.println(difference); //[1,5]
    }


}

/*
removeIf
Bu metod özellikle kümeler arası fark hesaplamada veya iki liste/koleksiyon arasındaki ortak elemanları çıkarmak için çok kullanışlıdır.

 */
/*

4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers
(elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}

 */
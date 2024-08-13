package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A9_UniqueElements {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(each-> Collections.frequency(list, each)>1); //each p olabilir

        System.out.println(list);

    }
}

/*
9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */
package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A8_RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));
        List<Integer> newList = new ArrayList<>();
        // size int declare etmedik bunun yerine yeni bos liste olusturduk

        for (int i = 0; i < list.size(); i++) {

            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i)); //      int each = list.get(i);
            }
        }

        System.out.println(newList);

        //Second way
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if(Collections.frequency(list,i)>1){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);

    }

}


/*

8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */
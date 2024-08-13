package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class A7_MaximumAndMinimumNumbers {

    public static void main(String[] args) {

       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
      //  System.out.println(nums); [1, 2, 3, 4, 5]

      // max = 0 kiyaslama ypmak icin 0 indeksinde ki sayiyi aldik
        int max = nums.get(0); // Integer.MIN_VALUE;
        int min = nums.get(0);; // Integer.MAX_VALUE;  int min = 0; yparsak hep en kücük rakami 0 verir.
                               // cünkü list icinde 0 dan kücük rakam yok

        for(int each : nums){
            if(each > max ){
                max = each;
            }
            if(each < min ){
                min = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}



/*
int each: Bu ifade, for-each döngüsünün bir parçasıdır. for-each döngüsü,
bir koleksiyonun (bu örnekte bir ArrayList<Integer>) her bir elemanını sırasıyla almanıza olanak tanır.

Veri Türü: each değişkeninin türü int olarak belirlenmiştir, çünkü nums listesinin elemanları Integer türündedir.
Java'da int ve Integer arasında otomatik dönüştürme (autoboxing) yapılabilir,
bu nedenle for-each döngüsünde int türü kullanılabilir.

 */
/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */
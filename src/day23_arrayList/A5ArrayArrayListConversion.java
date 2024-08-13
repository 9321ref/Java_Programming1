package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A5ArrayArrayListConversion {

    public static void main(String[] args) {


        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // arr is array and primitive type ,
        // I want to convert array to the collection.but type of array is NON-primitive (String).that's why I write with aslist


        System.out.println(list); //[A, B, C, D]


        System.out.println("------------------------ ArrayList to the Array --------------------------");

        // array can be multi-dimensional, array are supported all data type (primitive, non-primitive)
        //fixed size of array is disadvantage
        // array is faster than arrayList
        //arras doesn´t have many method

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

        // converting arrayList to the Array
        String[] languages = list2.toArray(new String[5]); //[Java, Python, C#, null, null]
       // String[] languages = list2.toArray(new String[list2.size()]); // [Java, Python, C#]
       // String[] languages = list2.toArray(new String[0]); //[Java, Python, C#]

        System.out.println( Arrays.toString(languages));

        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

       // Integer[] n = nums.toArray(new Integer[9]); // [1, 2, 3, 4, 5, 6, 7, null, null]

        Integer[] n = nums.toArray(new Integer[0]); //[1, 2, 3, 4, 5, 6, 7]

        System.out.println(Arrays.toString(n));
        //Özetle, Integer[] n = nums.toArray(new Integer[0]); satırı, nums adındaki ArrayList'i Integer[] türünde yeni(new)bir Array 'e dönüştürür
        // ve bu Array 'e  n adında bir referans atanır.

    }
}

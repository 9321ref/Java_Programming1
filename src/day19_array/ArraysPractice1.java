package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin"; // first element of arrays
        myGroup[myGroup.length-1] = "Aseel"; // the last element of arrays
        myGroup[2] = "Sumeyye";
        myGroup[1] = "Enes";
        myGroup[3] = "Nurefsan";
        System.out.println(Arrays.toString(myGroup)); // [Gulcin, null, null, null, Aseel]
                                                      //[Gulcin, null, Sumeyye, null, Aseel]
                                                      //[Gulcin, Enes, Sumeyye, null, Aseel]

        myGroup[1] = "Hasan";
        System.out.println(Arrays.toString(myGroup)); //[Gulcin, Hasan, Sumeyye, null, Aseel] Enes --> Hasan

        System.out.println("-----------------------------------------------------------");

        for (int i = myGroup.length -1; i >= 0; i--) {
            System.out.println(myGroup[i]); // sondan basa dogru yazdirdik

            System.out.println("--------------------------------------------------------------");

        // reverse for loop with array  'forr' .If I want to write from end to begin (reverse order)
            for (int i1 = myGroup.length - 1; i1 >= 0; i--) {

            }
        }


    }


}

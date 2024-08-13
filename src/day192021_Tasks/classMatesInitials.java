package day192021_Tasks;

import java.util.Arrays;

public class classMatesInitials {

    public static void main(String[] args) {

        //1- Create an array of strings named classmates.
        String[] classMates = new String[5];

        classMates[0] = "Tuba A";
        classMates[classMates.length-1] = "Nazan A"; // the last element of array
        classMates[1] = "Reyhan Y";
        classMates[2] = "Nuray N";
        classMates[3] = "Esra A";

        System.out.println(Arrays.toString(classMates));
        //output: [Tuba, Reyhan, Nuray, Esra, Esin]


        //2- Store full names of 10 classmates.
        String[] classMates1 = {"Tuba A.", "Reyhan Y.", "Nuray T.", "Esra A.", "Nazan A."};
        System.out.println(Arrays.toString(classMates1));


        //3- Print the initials of each student's name in separate lines.
        //using for-each loop
        for (String eachMates : classMates1) {
            System.out.println(eachMates.charAt(0) + "" + eachMates.charAt(eachMates.indexOf(' ') + 1));

            // 0 kelimenin ilk index numarasi -> T R N E N
            //
            //eachMates.charAt(0) ifadesi "J" (0. karakter)
            //eachMates.charAt(eachMates.indexOf(' ') + 1): İlk boşluktan sonraki karakteri alır.

            System.out.println("1 ----------------SECOND WAY WITH LOOP----------------------");

            for (int i = 0; i < classMates1.length; i++) {
                eachMates = classMates1[i];
                System.out.println(eachMates.charAt(0) + "" + eachMates.charAt(eachMates.indexOf(' ') + 1));




            }
        }



    }
}
/*
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */
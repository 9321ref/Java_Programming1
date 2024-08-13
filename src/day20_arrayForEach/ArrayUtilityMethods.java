package day20_arrayForEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

// ........................... toString (print) ..................................
        int[] score = {20, 30, 40, 80};

        System.out.println(Arrays.toString(score)); //  Arrays.toString ->long char string int double use for everyone to print

        String result = Arrays.toString(score);
        System.out.println(result);//[20, 30, 40, 80]

        System.out.println("----------------------------------------------");

//........................  Equals .............................

        int[] a1 = { 1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

       boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1); // true

        char[] ch1 = { 'a', 'b', 'c'};
        char[] ch2 = { 'a', 'c', 'b'};

       boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2); // false same elements but different order

        System.out.println("---------------------------------------------------");


// ................... Sort method -> ascending numbers,alphabet ....................

// interview de bu methodu istemiyorlar.for loop istiyorlar

        int[] nums = {100, 80, 90, 75, 88, 99, 2, 4, 1000, 500 };

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); //[2, 4, 75, 80, 88, 90, 99, 100, 500, 1000] ascending artan numara
        System.out.println("Minimum number: " + nums[0]);//Minimum number: 2
        System.out.println("Maximum number: " + nums[nums.length-1]);//Maximum number: 1000

        System.out.println("-------------------------------------------------------");

        String[] b1 = { "C", "A", "B"};

        String[] b2 = { "B", "C", "A"};

        Arrays.sort(b1); //b1 = {A, B, C}
        Arrays.sort(b2);//b2 = {A, B, C}

        System.out.println( Arrays.equals(b1, b2)); // true

        String[] students = {"Refia Nur", "Hasan", "Enes", "Nurefsan"};

        Arrays.sort(students);
        System.out.println( Arrays.toString(students)); //[Enes, Hasan, Nurefsan, Refia Nur] harf önceligine göre siraladi

        System.out.println("----------------------------------------------------");

        int [] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array,6);
        System.out.println(Arrays.toString(array2));//[10, 20, 30, 40, 50, 60]

        System.out.println("--------------------------------------------------------");

 // ........................... copyOf ..........................................

        int [] n1 = {1, 2, 3, 4, 5};
        int [] n2 = {6, 7, 8, 9, 10, 11, 12};

        int [] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];

        }
         // j: n1.length -> n1 uzunlugunun sonndan basla n1 uzunlugu 5.
        System.out.println(Arrays.toString(n3));

        System.out.println("-------------------------------------------------");

        char[] ch = {'A','B','C','D','E','F','G'};
                                                                                        //truncating or padding with zeros of chars
                                                                                        // ch uzunlundan fazla old icin
        char[] result1 = Arrays.copyOf(ch,20);// 4 --> [A, B, C, D]  20 -->[A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(result1));

//....................... copyOfRange .................................
        
        char[] result2 = Arrays.copyOfRange(ch,2,5); // excludes ending index [C D E]
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length); //[C, D, E, F, G]

        System.out.println(Arrays.toString(result3));












    }
}

package day19_array;

import java.util.Arrays;
public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("------------------------------------------");

        int[] scores = new int[5]; // index 0 ~ 4 ,the size of array 5.
                                  // I stored 5 element "scores" in one array.minimum size array is 0.

        scores[0] = 85; // 0 is index number -> 'score1'
        scores[1] = 75; // 1 is index number -> ' score2
        scores[2] = 78; // 2 is index number -> 'score3'
        scores[3] = 88;
        scores[4] = 95;

          //scores[5] = 100; ArrayIndexOutOfBoundException : index 5 out bounds for length 5.

         // scores = new int[10]; // yeni deger atamak istersek yeni array olusturabilirsin index: 0 ~ 9
                             //   int[] scores = new int[5]; --> eligible for garbage collection.
        //   scores = new int[50]; // index : 0 ~ 49 (artik yeni arrayimiz bu diger önce ki ikisi cöp)


      //  System.out.println(scores); --> you are getting hash code
        System.out.println( Arrays.toString(scores));

        System.out.println( scores[2] ); // for finding index 2 --> 78

        System.out.println("----------------------------------------------------");

        // for all element of arrays, we use loop
        for (int i = 0; i < 5; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }
      //  for (int i = 0; i < scores.length; i++) {
      //      System.out.println( scores[i] );
      //  }

        System.out.println("-------------------------------------------------------");
        System.out.println( scores[scores.length-1]); // last indexOf number --> 95


    }


}

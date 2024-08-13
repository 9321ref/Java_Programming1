package day20_arrayForEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray(); // replace olmayadabilir console da ki bosluklari silmesi icin ekledim
        // String str, char ch dönüstür

        System.out.println(Arrays.toString(ch));//[C, y, d, e, o, S, c, h, o, o, l]
        // [C, y, d, e, o,  , S, c, h, o, o, l]

        System.out.println("-------------------------------------------------------");

        String str2 = " Today is a great day to learn java";

        String [] words = str2.split(" "); // string str words altinda split yap yani bosluklari atla
        String [] word = str2.split("great ");

        System.out.println( Arrays.toString(words)); //[, Today, is, a, great, day, to, learn, java]
        System.out.println( Arrays.toString(word)); //[ Today is a , day to learn java]

        System.out.println("------------------------------------------------------------");

        String sentence = "I love Java";

        String[] arr = ArraysUtility.reverse( sentence.split(" ") ); // [Java love I]

        System.out.println(Arrays.toString(arr));//[Java, love, I]

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }

        System.out.println(reversedSentence); //Java love I

    }
}

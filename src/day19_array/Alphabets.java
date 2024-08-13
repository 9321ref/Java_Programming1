package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {
        
        char[] ascending = new char[26]; // index: 0 ~ 25
        char[] descending = new char[26];// index: 0 ~ 25

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) { // i:0 j:'A', i:1 j:'B', i:2 j:'C'....
                                                                                 // i:0 k:'Z', i:1 j:'Y', i:3 j:'X'....
            ascending[i] = (char) j;  // j int normalde biz char istiyoruz.
            descending[i] = (char) k; // Z ~ A
        }

        System.out.println(Arrays.toString(ascending)); //[A,B,C,D....]
        System.out.println(Arrays.toString(descending));

        System.out.println("-------------------------------------------------------");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i; // i is int ,reassign as a char

        }
        System.out.println(Arrays.toString(characters));
    }
}

/*
- i dizinin indeksini takip eder.
- j ve k ise sırasıyla ascending ve descending dizilerinin her bir elemanını ayarlamak için kullanılır.

j ve k aynı döngüde birlikte kullanılmasının sebebi, ascending ve descending dizilerini aynı anda doldurabilmektir. Bu sayede tek bir döngü ile her iki diziyi de doldurmuş olursunuz.

Özetle, j değişkeni ascending dizisini A'dan Z'ye doldurmak için, k değişkeni ise descending dizisini Z'den A'ya doldurmak için kullanılır. Bu değişkenler, döngüde eş zamanlı olarak güncellenir
 */

/*
	3. Create a char array and store all the alphabet letters in ascending order (artan)

	4. Create a char array and store all the alphabet letters in descending order (azalan)
 */
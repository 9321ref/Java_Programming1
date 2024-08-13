package day16_nestedLoop;

public class FrequencyOfACharInterview {

    public static void main(String[] args) {

        String str = "xxcaabbbcccc";

        char ch = 'c'; // eger bu karekteri string de bulursa , hesapalama  baslayarak bi artar

        int count = 0; // count increase by 1 .nedn sifir cünkü henüz 'c' karektri var mi bilmiyorz.karekterin kac kez gectigin saymak icn

        for (int i = 0; i < str.length(); i++) {// i: index numbers of str
            if(str.charAt(i) == ch){
                // if the character of the string is equal to the given character, it means the given character has appeared in the string
                count++;
            }

        }
        System.out.println(count);
    }



}
/*
  2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */
package day20_arrayForEach;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java  ";

        str = str.trim(); // bosluklari kaldirir

        System.out.println(str);

        String[] words = str.split(" "); // " " stringte bu noktalri ve bosluklari atla

       // System.out.println(words);

        System.out.println(Arrays.toString(words));

        str = "";

        for (String each : words){
            if(!each.isEmpty()){
                str += each+" ";
            }
        }

        System.out.println(str);




    }
}

/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */
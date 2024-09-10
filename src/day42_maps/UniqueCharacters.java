package day42_maps;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList(str.split("")), each );
            if(frequency == 1); // her bir ch bir taneyse;

            map.put(each.charAt(0),frequency ); // map'e put methoduyla ekle
        }
        System.out.println(map);
    }

}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */
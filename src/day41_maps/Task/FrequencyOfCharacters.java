package day41_maps.Task;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
          if(map.containsKey(key)) { //Her karakterin daha önce map içinde olup olmadığı kontrol edilir.
              map.put(key, map.get(key) +1);
          }else {
              map.put(key,1);
          }
        }

        System.out.println(map);
    }
}

/*
4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */
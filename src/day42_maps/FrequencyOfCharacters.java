package day42_maps;


import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>(); // insertion order

        for(String each : str.split("")) { // split tek tek ayiracak harfleri string array seklinde
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each); // split arrayi collection type' convert ypmak gerekyor(Arrays.asList)

            map.put(each,frequency); //frequency her bir characteri map ekledik
            /*
            Map<Character, Integer> map = new LinkedHashMap<>();
            map.put(each.charAt(0),frequency); eger map key name Character olsaydi ,bu sekilde map'e elementleri store yapardik
             */
        }
        System.out.println(map); //output:{b=2, c=3, a=5}

        //**** Collection utility class day23 ( frequency ,replaceAll....) bakablirisin

    }
}

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}

 */
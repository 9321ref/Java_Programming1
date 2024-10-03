package day41_maps.Task;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";
        Map<Character,Integer> map = new LinkedHashMap<>();
        String checked = "";

        for(int i = 0; i < str.length(); i++) {
            char key = str.charAt(i); // i index deki karekteri alir ,key assing eder
            if(!checked.contains("" + key) && !map.containsKey(key)) { // "" + char String e dönüstürmek
                map.put(key, 1); //map.put(key, 1); ile karakter map'e eklenir. Bu durumda key, 1 değeriyle map'e kaydedilir.
                checked += key;
            }else {
                map.remove(key);
            }
        }
        System.out.println(map);
    }


}

/*

5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */
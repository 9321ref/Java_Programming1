package day41_maps.Task;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        System.out.println(map);

        Map<String,Integer> inverted = new HashMap<>();

        for(Map.Entry<Integer,String> each : map.entrySet()) {
            inverted.put(each.getValue(), each.getKey());
        }

        System.out.println(inverted); //{a=1, b=2, c=3}

        System.out.println("2 solution-------------------------------------------------");

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        System.out.println(map1);

        Map<String, Integer> inverted1 = new LinkedHashMap<>();

        map1.forEach((k, v) -> inverted1.put(v, k));

        System.out.println(inverted1);
    }
}

/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}

 */
package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {

        //   key     value
        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000); // key , value
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Chris", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        //Iterating the map by the keys
        for(String eachKey : map.keySet()) {
            System.out.println(eachKey);
           //1- map.replace(eachKey, map.get(eachKey) * 2 ); // her maasi replace yapti. her bir maasi get ile alip ikiye carparak
        }

         //1- System.out.println(map);


        System.out.println("1--------------------------------------------------");

        //Iterating the map by values
        for(Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("2--------------------------------------------------");

        //Iterating the map by entries /pairs

        for( Map.Entry<String,Integer> eachEntry : map.entrySet()) { //
            System.out.println(eachEntry);
        }

        System.out.println("3--------------------------------------------------");

        for( Map.Entry<String,Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000); // her birine 10000 ekledi
            System.out.println(eachKey +" : "+eachValue);
        }
        System.out.println(map); //{Daniel=105000, Emily=110000, Bella=95000, Arron=88000, Chris=88000, Breanna=108000}
    }
}
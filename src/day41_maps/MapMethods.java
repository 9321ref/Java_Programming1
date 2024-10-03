package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
/*
pair: id - name
 */

        Map<String,String> map = new TreeMap<>(); // TreeMap can duplicate value.if key is unique ("Tatiana")
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println("map = " + map);

        System.out.println(map.get("A04")); // Tatiana 'key' not value
        System.out.println(map.get("Tatiana")); //null because get method is using for key

        map.put("A04","Lucy"); // update
        map.put("A06","Madiyar"); // update

        System.out.println(map);

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");
        System.out.println(map); //Josh -> Aseel / Tatiana -> Marika

        map.remove("A05"); // key

        System.out.println(map);


        System.out.println(map.containsKey("B03")); // key
        System.out.println( map.containsKey("H98"));

        System.out.println(map.containsValue("Lucy")); // value
        System.out.println(map.containsValue("Muhtar"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map)); // true
        System.out.println(map.equals("A06")); //false


        map.clear(); // {}

        System.out.println(map);




    }
}

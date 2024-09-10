package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>(); // TreeMap can duplicate value.if key is unique ("Tatiana")
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        Map<String,String> employees = new TreeMap<>(); // sorted
        employees.putAll(map);
        System.out.println(employees); //{A02=Khashayar, A03=Tatiana, B03=Nora, C02=Josh, D02=Abidullah}
        System.out.println(map == employees);// false -> because two different object .there are two different memory allocations
        System.out.println(map.equals(employees)); // true .every single pairs esit mi dye bakar
    }
}

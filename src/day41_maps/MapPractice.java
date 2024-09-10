package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        //  key      value :int ,String, double olabilir her birini kapsamasi icin Object
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("age",32); //autoboxing ' converting automatic wrapper class '-> value Object sebebi
        person1.put("job_title","Developer");
        person1.put("salary",10000.5);
        person1.put("married",true);

        System.out.println( person1);

        System.out.println(person1.get("name"));//Arthur
        System.out.println(person1.get("salary"));//10000.5
        System.out.println(person1.get(0)); // null because we don't have key '0'
        System.out.println(person1.get("job_title"));//Developer
    }
}

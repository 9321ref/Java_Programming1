package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        System.out.println("person1 = " + person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        System.out.println(person2.get("name"));// output : Nora
        System.out.println(person2.get("job_title"));

        System.out.println("1-----------------------------------------------");

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        System.out.println(person3);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);


        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        System.out.println("2-------------------------------------------------------");

        List<Map<String, Object>> listOfMaps = new ArrayList<>(); // mapsleri List icine eklyoruz
        listOfMaps.add(person1);
        listOfMaps.add(person2);
        listOfMaps.addAll(Arrays.asList(person3,person4,person5));

       // listOfMaps.addAll(Arrays.asList(person3));

        System.out.println(listOfMaps);

        System.out.println("3-------------------------------------------------------");

        for(Map<String,Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
            for(Map.Entry<String,Object> eachEntry : eachMap.entrySet()){ // each entry is each pairs
                System.out.println(eachEntry);
            }
        }

        System.out.println("4-------------------------------------------------------");

        // display the names of the employee who are hired this year (2022)
        for(Map<String,Object> eachMap : listOfMaps) {
            for (Map.Entry<String,Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hired_date")) {
                    if(((LocalDate)eachEntry.getValue()).getYear() == 2022){  //getValue return Object, Object is Parent class, and we cannot call method from LocalDate.we should do down casting
                       // System.out.println(eachEntry);                         //eachEntry.getValue() -> this is a LocalDate but Object type 'reference type is Object.we need to child method (down-casting)
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }

        System.out.println("5-------------------------------------------------------");

        listOfMaps.get(0).replace("name","Vasyl"); // Arthur -> Vasyl

        listOfMaps.get(listOfMaps.size()-1).replace("salary", ((Integer)listOfMaps.get(listOfMaps.size()-1).get("salary")) +5000); //

        listOfMaps.get(1).replace("age",((Integer)listOfMaps.get(1).get("age"))+4); // casting Integer

        System.out.println(listOfMaps);

        System.out.println("6-------------------------------------------------------");

        Map<String,Object> car1 = new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2021);
        car1.put("color","Red");
        car1.put("price",45000.5);

        Map<String,Object> car2 = new LinkedHashMap<>();

        Map<String,Object> car3 = new LinkedHashMap<>();

        Map<String,Object> car4 = new LinkedHashMap<>();

        List<Map<String,Object>> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1,car2,car3,car4));
        System.out.println("cars = " + cars);

    }
}

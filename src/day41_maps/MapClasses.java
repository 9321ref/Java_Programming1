package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


       // Map<String, Integer> hashMap1 = new Map<>(); //Map interface and cannot create Object
       // Map<String, Integer> hashMap = new LinkedHashSet<>();// error because there is no relationship

        //   key     value
        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key & null values
        hashMap.put("Daniel",95000); // key , value
        hashMap.put("Emily",100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Arron",78000);
        hashMap.put("Chris",null);
        hashMap.put("Breanna",null);// accept null value
        hashMap.put(null,12000);// accept null key
        hashMap.put(null,10000);// en son yazdgim icin null key bunu yazar
        hashMap.put("Daniel",80000);//bir cok key ayni olsa bile bi tane daniel yazar key eklemez, ama value update yapar.
                                   // hashMap does not allow duplicate.

        System.out.println("hashMap = " + hashMap); // output: hashMap = {null=10000, Emily=100000, Breanna=null, Chris=null, Arron=78000, Daniel=80000, Bella=85000} -> random order

        System.out.println("----------------------------------------------------------");


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts null key  & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);//linkedHashMap = {Daniel=95000, Emily=100000, Bella=85000, Arron=78000, Chris=null, Breanna=null, null=100000}

        System.out.println("----------------------------------------------------------");


        Map<String, Integer> treeMap = new TreeMap<>();// sorted order, does not accept null key, accepts null values

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        //map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);// value can be null in treeMap
     //   treeMap.put(null, 120000); key can not be null in treeMap -> NullPointerException
     //  treeMap.put(null, 110000);
     //   treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap); //treeMap = {Arron=78000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=100000}


        System.out.println("----------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>();// random order, does not accept null key & null values, Synchronized

        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
      // hashtable.put("Chris", null); // value cannot be null -> NullPointerException
      // hashtable.put("Breanna", null);
      // hashtable.put(null, 120000); // key cannot be null in Hashtable  -> NullPointerException
      // hashtable.put(null, 110000);


       try {
           hashtable.put("Diana", 100000);  // un exception runtime grünür
       }catch (RuntimeException e){
           e.printStackTrace(); // tüm detaylari verr
       }

        System.out.println("hashtable = " + hashtable);
    }

}
/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */
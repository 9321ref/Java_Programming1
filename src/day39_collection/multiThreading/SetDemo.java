package day39_collection.multiThreading;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(100,200,300,40,90));
        list.addAll(Arrays.asList(100,200,300,40,90));
        list.addAll(Arrays.asList(100,200,300,40,90));

        System.out.println(list);//output: [100, 200, 300, 40, 90, 100, 200, 300, 40, 90, 100, 200, 300, 40, 90]

        System.out.println("---------------------- 1 --------------------------------------");


        Set<Integer> set1 = new HashSet<>(); // keeps insertion order, accepts null key
        set1.addAll(Arrays.asList(100,200,300,40,90)); // order is random [100, 200, 40, 90, 300]
        set1.addAll(Arrays.asList(100,200,300,40,90));
        set1.addAll(Arrays.asList(100,200,300,40,90));
        set1.addAll(Arrays.asList(null,null,null,null,null)); // set does not allow duplicate,that is why jest one time execute null

        System.out.println(set1);

        System.out.println("----------------- 2 ----------------------------");


        Set<Integer> set2 = new LinkedHashSet<>();// keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);

        String str = null;
        //System.out.println(str.toLowerCase()); //NullPointerException.Cannot invoke "String.toLowerCase()" because "str" is null

        System.out.println("------------------ 3 ---------------------------");

        Set<Integer> set3 = new TreeSet<>();// Keeps sorted order, does not accept duplicate
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // set3.addAll(Arrays.asList(null, null, null, null, null)); //NullPointerException

        System.out.println(set3);


        System.out.println("------------------- 4 ----------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        LinkedHashSet<String> result = new LinkedHashSet<>();

        result.addAll(Arrays.asList(words)); // direk words yazdiramazsin.sadce collection type yazdirilir.covert yapmalisin word'u ,collection type aslist ile

        System.out.println(result); //output : [Java, Python, C#, C++, Ruby] LinkedHashSet no duplicate and write with order

       // System.out.println(result.get(1)); it cannot be use get method. because linkedhashset no index num
/*
        for (String each : result){
            System.out.println(each);
        }

 */

        System.out.println(new ArrayList<>(result).get(1)); // all element in the Arraylist and we can use get method output: Python

        words = result.toArray(new String[0]); // converting Set to Array

        System.out.println("Words Array: "+ Arrays.toString(words));//output : [Java, Python, C#, C++, Ruby]


        System.out.println("------------------------- 5 -------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        Set<Integer> n = new TreeSet<>(numbers); //List to Set

        System.out.println(n);

       // numbers = new ArrayList<>(n);

    }
}

package day40_collection;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 300, 400, 100,200, 500,600,700));

        System.out.println(collection);
        System.out.println( ((ArrayList)collection).get(2)); // there is no get method in the collection.that's why we need down casting.
     //   System.out.println(((Stack)collection).pop());//"ClassCastException".collection reference type reference ArrayList object,doesn't reference Stack.
                                                     // Collection<Integer> collection = new ArrayList<>();

        System.out.println("---------------------------------------------------------------");

        Collection<Integer>collection1 = new HashSet<>();
        collection1.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection1);//output: [400, 100, 500, 200, 600, 300, 700]-> random ,no double element

       // System.out.println( ((ArrayList) collection1).get(4) ); //"ClassCastException".you cannot directly cast hashset to the ArrayList.
                                                               // because there is no relationship

        System.out.println(new ArrayList<>(collection1).get(4)); // constructor -> collection1 converts to ArrayList .and we can get all elements with get method but just one time use only
                                                                 // after this eligible for garbage collection

        // when you need multiple time get hashset all elements.in this case you should be assign reference variable
        List<Integer> l = new ArrayList<>(collection1); //output : 600



    }
}

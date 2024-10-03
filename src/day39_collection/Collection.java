package day39_collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

    public class Main {
        public static void main(String[] args) {

            //Collection is a group of individual objects as a single entity

            // Create an ArrayList that can hold different data types using Object
            List<Object> mixedCollection = new ArrayList<>();

            // Add different data types
            mixedCollection.add("War and Peace");   // String
            mixedCollection.add(1984);              // Integer
            mixedCollection.add(3.14);              // Double
            mixedCollection.add(true);              // Boolean


            // Print the collection
            System.out.println("My Mixed Collection: ");
            for (Object element : mixedCollection) {
                System.out.println(element);
            }
        }
    }
}

package day39_collection.Task;

import java.util.*;

public class Task3_CommonElements {
    public static void main(String[] args) {

    //solution 1
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0)); // element set1 bu sekildede eklenir

        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60)); // element set2 bu sekildede eklenir

        Set<Integer> commonElements = new TreeSet<>();


        for( Integer each : set1) {
            if(set2.contains(each)) {
                commonElements.add(each);
            }
        }
        System.out.println(commonElements);

        System.out.println("solution 2--------------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set1);
        list.addAll(set2);

        list.removeIf(p -> Collections.frequency(list,p) < 2); // burada ki removeIf elemanlari silerek islem yapar

        Set<Integer> commonElements1 = new TreeSet<>(); // treeSet does not accept double element
        commonElements1.addAll(list);

        System.out.println(list); // [10, 20, 0, 0, 20, 10]
        System.out.println(commonElements1); //[0, 10, 20]

        System.out.println("solution 3--------------------------------------------------");

        for (Integer each : list) {
            if(Collections.frequency(list,each) > 1){ //burada ki remoceIf for each döngüsüyle her elemani ayri islenip sete eklenir.Eğer each değeri listede birden fazla bulunuyorsa, bu koşul true olur.
                commonElements1.add(each); //Eğer bir eleman listede birden fazla bulunuyorsa, commonElements1.add(each) ile bu eleman commonElements1 setine eklenir.
            }

        }

        System.out.println(commonElements1);



    }
}

/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */
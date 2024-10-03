package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_4 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

      //  list1.addAll(numbers);//[1, 2, 3, 10, 20, 30, 40]

        list1.addAll(1,numbers); //[1, 10, 20, 30, 40, 2, 3] index 1 den snra numbers yazdr

        System.out.println(list1);

        System.out.println("---------------- BUlK METHOD / addAll -------------------");

        ArrayList<Integer> scores = new ArrayList<>();

       // scores.addAll(75,85,95,80) error . In Array, we can write multiple element at once .Arraylist at once, it can not.but for arrayList must use from Arrays Utility Class aslist method

       // Arrays Utility Class it has asList method to write all elements
        //	asList(): returns a List, that contains the specified elements/array
        //removeAll, containAll, addAll those are BULK operations it has to be collection .they only accept collection type as an argument

        scores.addAll(Arrays.asList(75,85,95,80));// if you want to add multiple element you can use addAll method

        System.out.println(scores);


        System.out.println("---------------------  addAll  --------------------------");

        ArrayList<String> students = new ArrayList<>();

       // students.addAll("Enes","Hasan", "Nurefsan"); error ,addAll it takes only one argument. those four arguments you need to pass  one argument.
        // it has to be collection type.addAll takes collection type.then those elements has to be converted to collection type

        students.addAll(Arrays.asList("Enes","Hasan", "Nurefsan","Fatma")); //[Enes, Hasan, Nurefsan]

        System.out.println(students);

        students.addAll(2,Arrays.asList("Refia","Cevdet","Fatma")); // index 2 de bu isimleri yazdir


        System.out.println(students);

        System.out.println("-----------------------------------------------");

        //arrayList method for converting Array to the ArrayList .
        // you have to make sure when you are converting the Array to ArrayList non-primitive array. why ?
        // because collection it does not support primitive

        Integer[] nums = {1,2,3,4,5,6,7,8}; // if it non-primitive arrays data type, it can be converted to a collection type
                                           // int primitive type can not convert collection type.it has to be Integer

        ArrayList<Integer> l1 = new ArrayList<>(); //first way to convert

       //l1.addAll(nums); error --> addAll methods,it is asking you the pass collection type. but num is here Arrays
       // array is not collection, Chat gbt te arsivledim aciklamayi


       // ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // second way to convert  "make sure both of them must be non-primitive type
        l1.addAll(Arrays.asList(nums));


        System.out.println(l1); //[1, 2, 3, 4, 5, 6, 7, 8] primitive arrayi arraylist yazdirdik

        System.out.println("----------------------  containsALL  ---------------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("alina","muhtar", "sevde","ahmet")); //[alina, muhtar,  sevde, ahmet]


        System.out.println(employeeList);

        boolean hasAlina = employeeList.contains("alina");

        boolean hasAlinaSevde = employeeList.containsAll(Arrays.asList("alina","sevde"));

        boolean hasMuhtarAliAhmet = employeeList.containsAll(Arrays.asList("muhtar", "ali","ahmet"));

        System.out.println("hasAlina =" + hasAlina);// true

        System.out.println(hasAlinaSevde);// true

        System.out.println("hasMuhtarAliAhmet = "+hasMuhtarAliAhmet); // hasMuhtarAliAhmet = false

        System.out.println("---------------------------    removeALL   -------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,10,10,10,10,10,20,20,20,20));

        list.removeAll(Arrays.asList(10,20));

        System.out.println(list); //[30, 40, 50, 60, 70, 80]

        System.out.println(" ---------------------- retainAll --------------------");

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Alena","Muhtar","Ali","Alena","Muhtar","Muhtar","Refia","Enes"));

        developers.retainAll( Arrays.asList("Alena", "Muhtar","Ali")); //[Alena, Muhtar, Ali, Alena, Muhtar, Muhtar]

        System.out.println(developers); // sectigi elementleri kac taneyse ona göre alir sadece



        System.out.println("----------------------- retainAll ---------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll( Arrays.asList("Eggs","Apple","Cheese","Milk","Tomato","Oranges","Rice"));

        groceriesList.retainAll( Arrays.asList("Eggs","Milk","Rice")); //[Eggs, Milk, Rice]

        groceriesList.removeAll( Arrays.asList("Eggs", "Milk", "Rice")); //[Apple, Cheese, Tomato, Oranges]

        System.out.println(groceriesList);








    }

}

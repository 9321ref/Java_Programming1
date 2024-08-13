package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A1ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100; // update a value of array

        // array de value degisikligi yapabilirsin, fakat arraylistte value degisikligi icin method lazim

        System.out.println(Arrays.toString(array)); // output [100, 2, 3, 4, 5]

        System.out.println("1 ------------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

      //  groceriesList[2] = "orange"; //error --> arraylist te value degistirmek icin method kullanmak lazim

     // ----------------------------- set method -----------------------------

        groceriesList.set(2, "Oranges"); //[Eggs, paper Towels, Oranges, Cooking Oil]

        System.out.println(groceriesList); // index 2 has updated [Eggs, paper Towels, Oranges, Cooking Oil]

        groceriesList.add(2,"Chicken"); // add method it increases size of arraylist
                                                      // set method update of arraylist


        System.out.println("------------------------- remove ------------------------");


        System.out.println(groceriesList); //[Eggs, paper Towels, Chicken, Oranges, Cooking Oil]

        groceriesList.remove(0);

        System.out.println(groceriesList); //[paper Towels, Chicken, Oranges, Cooking Oil]

        groceriesList.remove(0);
        System.out.println(groceriesList);// PaperTowel gitti

        groceriesList.remove("Chicken");
        System.out.println(groceriesList); //[Oranges, Cooking Oil]


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50); // 4

        numbers.remove(2);
        System.out.println(numbers); //[10, 20, 40, 50]

        //valueOf methods: returns wrapper class objects, converts String to wrapper class values
         boolean r1 =  numbers.remove(Integer.valueOf(10)); // as a wrapper class object --> primitive int convert Wrapper class object
        System.out.println(r1); // element remove oldu mu olmadi mi boolean o yzden koyduk


        System.out.println("------------------- contain (boolean) ----------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Ayse");//0
        names.add("Ayse");//1
        names.add("Enes");
        names.add("Elif");
        names.add("Ali");
        names.add("Ahmet");// 5

        System.out.println(names.indexOf("Ayse"));  //0
        System.out.println(names.lastIndexOf("Ayse")); //1
        System.out.println(names.lastIndexOf("Ahmet")); //5


        System.out.println("-------------- contain METHOD ------------------");
        boolean hasRefia = names.contains("Refia"); // false
        boolean hasAli = names.contains("Ali");

        System.out.println("hasRefia = " +hasRefia); //false
        System.out.println("hasAli = "+hasAli); // true

        System.out.println("-------------- equals METHODS ---------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);//[10]
        System.out.println(list2);//[10]

        System.out.println(list1 == list2); // true

        // there are two different object
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1); // [10]
        System.out.println(l2); // []

        System.out.println(l1 == l2); // false

        System.out.println(l1.equals(l2)); //  true --> same elements in the same order - same order demk icinde ki elemnlerin sirasinin da ayni olmasi

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = "+ n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));// false because those are not same order

        System.out.println("------------------- isEMPTY METHOD -----------------------");

        System.out.println(n1.isEmpty());//false
        System.out.println(n2.isEmpty());//false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());//true
        System.out.println(n2.isEmpty());//true































    }
}

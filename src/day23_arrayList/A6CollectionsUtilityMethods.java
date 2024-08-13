package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.*;

public class A6CollectionsUtilityMethods {

 public static void main(String[] args) {

  //------------------ Max Min --------------------------------

  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

  int max = max(list); // unboxing -->(Integer)wrapper class object convert into primitive (int max)
  int min = min(list);

  System.out.println("max = " + max);
  System.out.println("min = " + min);

  System.out.println("----------------------- sort  ----------------------------- ");

  ArrayList<String> items = new ArrayList<>();

  items.addAll(Arrays.asList("Eggs", "Orange", "Towel", "Cheese", "Apple", "Olive"));

  sort(items);

  System.out.println(items); //[Apple, Cheese, Eggs, Olive, Orange, Towel] harflerin sirasina göre siralar

  System.out.println("----------------------  reverse (descending)-----------------------");

  reverse(items);

  System.out.println(items); //[Towel, Orange, Olive, Eggs, Cheese, Apple]

  System.out.println("------------------------- swap -------------------------------");

  ArrayList<String> names = new ArrayList<>();

  names.addAll(Arrays.asList("Ahmet", "Ali", "Enes", "Refia"));

  swap(names, 0, 2);

  System.out.println(names); //[Enes, Ali, Ahmet, Refia]

  swap(names, 0, names.size() - 1);

  System.out.println(names); //[Refia, Ali, Ahmet, Enes] bir üste ki arrayin son indeksiyle ilk indeksi degis tokus yapti


  System.out.println("---------------------------- replaceAll ---------------------------");

  ArrayList<String> names1 = new ArrayList<>();
  names1.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

  System.out.println(names1);
/*
        for(int i = 0; i < names.size(); i++){
            if (names1.get(i).equals("Java")){
                names1.set(i, "Python");  // set method belirlenen elemente " " su elementi ekle
            }
        }
*/

  replaceAll(names1, "Java", "Python");

  System.out.println(names1); //[Python, Python, Python, C#, C#, Ruby, Swift, Swift, Java]

  System.out.println("----------------------- frequency method -----------------------------");

  ArrayList<Integer> numbers = new ArrayList<>();
  list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

  numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

  int count = Collections.frequency(numbers,50);

  System.out.println(count);


  System.out.println("-----------------------------------------------------------");

  ArrayList<String> words = new ArrayList<>();
  words.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));

  int countJava = Collections.frequency(words,"Java"); // frequency return as int

  System.out.println(countJava);

  System.out.println("---------------- frequency method in the loop ------------------------");

  ArrayList<Integer> unique = new ArrayList<>();
  unique.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

  for(Integer each : unique){
   if( Collections.frequency(unique, each) == 1){ // eger unique koleksiyonunda each ögesi 1 kez frequence esitse islem calisir
    System.out.println(each); //10,30
   }
  }



 }
}

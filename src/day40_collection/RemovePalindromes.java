package day40_collection;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {


       List<String> names = new ArrayList<>();
       names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

      Iterator<String> it = names.iterator();

      while( it.hasNext() ){ // if this true comes next() method
        String each = it.next();

        String reverse = "";

        for(int i = each.length()-1; i >= 0; i--){ // find palindrome
            reverse += each.charAt(i);
        }
        if(each.equalsIgnoreCase(reverse)){
         //   names.remove(each);// remove collectionda olmaz
            it.remove();
        }
      }
        System.out.println(names); //[Java, Python, Cydeo, Car]

        System.out.println("---------------------reverse and Palindrome with removeIf-----------------------------------");

        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        names1.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p)); // reverse method has in the String Utility.(custom method in String utility)
        //  names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );second way

        System.out.println(names1);//




    }
}

package day22_arrayList;

import utilities.ArraysUtility;

public class Test {

    public static void main(String[] args){

        int[] numbers = {10,20,30,40,60,70,80,90};

        boolean has25 = ArraysUtility.contains(numbers,52);
        System.out.println("has25 = " + has25);

        System.out.println("------------------------------------------------------");

        String[] students = {"Enes", "Hasan","Fatma"};

        System.out.println(ArraysUtility.contains(students,"Nurefsan"));
        // String icin sout icinde ArraysUtility cagririyorz

    }
}

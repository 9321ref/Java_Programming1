package day22_arrayList;

import java.util.ArrayList;

public class A4IteratingArrayList {

    public static void main (String[] args ){

        ArrayList<Integer> numbers = new  ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);

        System.out.println(numbers); //[100, 200, 300, 255, 400, 500]

        System.out.println("---------------iteration-------------------");

        for(int i = 0; i < numbers.size(); i++){
            int each = numbers.get(i);
            System.out.print(each+ " "); //100 200 300 255 400 500

        }
        System.out.println("--------------------reverse---------------------");

        for(int i = numbers.size()-1; i >= 0; i-- ){
            System.out.println(numbers.get( i )); // 500 400 300 200 100

        }

        System.out.println("---------------------------------------------------");

        for (Integer each : numbers){ //it can be (int each : numbers)the best thing keep data type variable "Integer" as it is ArrayList's Object
            System.out.println(each); //100 200 300 400 500
        }


    }
}

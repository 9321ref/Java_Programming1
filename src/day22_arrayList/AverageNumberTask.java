package day22_arrayList;

import java.util.ArrayList;

public class AverageNumberTask {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(); //Array list accept only non-primitive  "wrapper class object" it can not be int (primitive type)

         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);

        System.out.println(list);

        int sum = 0;

        for(Integer each : list){
            sum+= each;

        }
        double average = sum / (double)list.size(); // bi sayi dizisinin ortalamasini bulmak icin, sayilarin toplamini adedine bölümü sayilarin ortalamsinin verir.

        System.out.println("average = " + average);





    }
}

// 2. Write a program that can find the average number from an arrayList of integers
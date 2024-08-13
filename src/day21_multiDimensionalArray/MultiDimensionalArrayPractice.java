package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel"}; // 2 names
        String[] group2 = {"Ahmet", "Reyhan", "Tuba"}; // 3 names
        String[] group3=  {"Enes", "Refia nur", "Hasan", "Nurefsan", "Esad"}; // 5 names
        String[] group4 = {"Fatma", "Cevdet"}; // 2 name

//                   FOR LOOP  1. solution
        String [][] groups = { group1, group2, group3, group4};
//                                0       1      2        3
        for (int i = 0; i < groups.length; i++) {
          String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);// her bir arrayi yazdirip arrayin elementlerini yazdrdi
            }
        }

        System.out.println( "1 ------------------ FOR EACH LOOP 2. solution ------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup) );
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }

        System.out.println(" 3--------------- REVERSE ORDER (for loop and for each loop) ---------------------");

        for (int i = groups.length - 1; i >= 0; i--) { // reverse kelimenin son uzunlugu index baslangici

            String[] eachGroup = groups[i];// gruplarin index baslangici(i) yani sondan her bir gruba eris
            System.out.println(Arrays.toString( eachGroup) );// [Fatma, Cevdet]

            for (String eachStudent : eachGroup) { // her bir ögrenciyi her bir gruptan
                System.out.println(eachStudent);

            }

        }

        System.out.println("--------------------------------------------------------------");

        System.out.println(groups);

        System.out.println( Arrays.toString(groups)); // toString() ---> for SINGLE DIMENSIONAL ARRAY

        System.out.println(Arrays.deepToString(groups)); // deepToString() ----> for multi dimensional array ONLY





    }
}

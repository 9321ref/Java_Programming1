package day22_arrayList;

import java.util.ArrayList;

public class A3ArrayListMethods {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(10); //3
       // list.add(5.5); double Integer do not convert double

        System.out.println(list); //[10, 20, 30, 10]

        list.add(1,15); // indexi 1 olana 5 assign yap

        System.out.println(list); // [10, 15, 20, 30, 10]

        list.add(2,25); //inserting new element (eklemek

        System.out.println(list); //[10, 15, 25, 20, 30, 10]

        System.out.println(" 1 -----------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Enes");
        studentList.add("Refianur");
        studentList.add("Hasan");

        System.out.println(studentList.size()); // 3
        System.out.println(studentList); //[Enes, Refianur, Hasan]


        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get(studentList.size() -1);

        System.out.println(firstStudent); // Enes
        System.out.println(lastStudent); //Hasan






    }
}


//those are instance method ,yani Object. bundan dolayi object yazarak cagiriyoruz
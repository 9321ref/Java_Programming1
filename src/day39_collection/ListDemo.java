package day39_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();// Array Based Class ===> get() is faster

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        System.out.println("1------------------------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();// Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster


        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

       // linkedList.get(0);
        System.out.println(linkedList);//[200, 300]

        System.out.println("2------------------------------------------------------------");

        //vector class is synchronized
        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);


        System.out.println(vector.get(0)); //100

        System.out.println("3----------------------get()--------------------------------------");

        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack.get(0));
        System.out.println(stack);//[100, 200, 300]

        System.out.println("4------------------------------------------------------------");


       //pop method en son element remove yapar from the stack
        int lastElement = stack.pop();// son element remove olur

        System.out.println(stack); //[100, 200]

        int secondLastElement = stack.pop(); //last element it will be removed

        System.out.println(secondLastElement);//200




    }
}
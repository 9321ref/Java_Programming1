package day37_exceptions;

import day36_Tasks.Pizza;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        while (true) {
            pizzas.add(new Pizza('S', 2, 3));
        }
// object allocate in the heap memory ,and heap memory has memory .we cannot create infinitive arraylist create
    }
}
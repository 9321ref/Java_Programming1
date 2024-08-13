package day18_garbageCollection;


import day17_customClass.Employee;

class Car{

    public String brand;
    public String model;
    public String color;
    public int year;



}


public class MemoryAllocations {

    public static void main(String[] args) {

        int a = 100;  // stack, local variable. 100 primitive value (int)

       //reference variable 'car' allocated in the stack
        Car car  =  new Car(); // --> new Car object  / new Car -> new memory it will be in the heap
        //  stack     heap

       // I took from employee class
        Employee employee1 = new Employee(); // new Object allocated in the heap
        Employee employee2 = employee1; // but here employee1 reference variable by employee2 ,then allocated in the stack.
                                        // this is not new object

    }

    public static void method1(){

        int b = 200; // stack

    }

    public static void method2(){

        String c =   "Hello World";
        //   stack      heap ('this is object' string literal only eligible in the String pool )

        String d = new String("Hello World");
        //  stack         heap ( outside String pool)
    }

}
/*
 main method, void method1, void method2 are allocated in the Stack
 */
package day25_constructors;

public class A5_ConstructorCalls2 {

    public A5_ConstructorCalls2(){
        System.out.println("Default");
    }

    public A5_ConstructorCalls2(int a){ //önce  Default, sonra int arg --> this(); default constructor methodu yazdik
        this(); // calling the default constructor
        System.out.println("int arg");
    }

    public A5_ConstructorCalls2(String a){  // önce Default, sonra int arg, en son String arg
        this(9);

        System.out.println("String arg");
    }

    public static void main(String[] args) {

        A5_ConstructorCalls2 obj1 = new A5_ConstructorCalls2(); // output : Default

        System.out.println("-------------------------------------------------------");

        A5_ConstructorCalls2 obj2 = new A5_ConstructorCalls2(9);

        System.out.println("--------------------------------------------------------");

        A5_ConstructorCalls2 obj3 = new A5_ConstructorCalls2("Java");
    }
}

package day25_constructors;

public class A4_ConstructorCalls {


    public A4_ConstructorCalls(){
        //this(9);// -->Constructors cannot call or contain itself
        System.out.println("Default constructor");
    }

    public A4_ConstructorCalls(int a){
       // A4_ConstructorCalls() --> constructor method icinde 2. constructor adiyla cagiramzsin.
        this(); // -->this(): used for calling constructors in another constructor and has to be at the first step
        System.out.println("Constructors with int argument");
      //  this(); --> constructor has to be at the first step
    }


    public A4_ConstructorCalls(double b){
        this(3); // constructors argumetini cagiramazsin bir önce ki argumentin data type kullanabilirsn
        System.out.println("Constructor with double argument");
    }


    public A4_ConstructorCalls(String c){
       this(2.5);

       // this(); --> COMPILE ERROR one constructor it cannot call more than one constructor in its BODY
        System.out.println("Constructor with String argument");
    }

    public A4_ConstructorCalls(int a,String c){
        this("Refia");  // --> constructor bir önceki string data type kullanablirsn

    }




    public static void main(String[] args) {

        method1();

        System.out.println("------------------------------------");

        method2();


    }

    // regular method/instance method, they can call each other
    public static void method1(){
       // A4_ConstructorCalls(); --> compile error because constructors cannot be called by its name
       // this(); -->
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();

        System.out.println("Method 2");
    }

}


/*
this: refers to the instances
    this.: to call instance variables & instance method
    this(): used for calling constructors in another constructor

Constructor Calls:
    1. Constructors can not be called by its name .with those are keyword can call constructors (  this() need to be used)
    2. Only a constructors can call another constructor
    3. Constructor call must be at the first step
    4. One constructor it can not call more than one constructor in its BODY
    5. Constructors can not call or contain itself

 */
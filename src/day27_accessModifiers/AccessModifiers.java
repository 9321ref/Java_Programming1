package day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static  int defaultData = 400;  // --> accesses modifier is default it means no modifier .I do not specifier any keyword like public protected then it is default
                             //it is not visible outside package or class

    private static int privateData = 500;

    public AccessModifiers(){ // -> constructors

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Default");
    }


    public static void main(String[] args) {
        System.out.println(publicData); //public accessible in the same class
        System.out.println(protectedData); //protected accessible in the same class
        System.out.println(defaultData); // default is accessible within same the class
        System.out.println(privateData); // private is  ''  ''   ''      ''

        // all of them can be accessible within same class
        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}


//public; in the same class ,package or outside package it is always accessible(utility test icinde aciklama)
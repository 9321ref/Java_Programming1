package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3(); // static method 3,4 bu nednle Class ismiyle cagirdik
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a); // instance method object ismiyle cagrilir
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("------------------------------------------");

        //public same class .package or outside package it is always accessible
        System.out.println(AccessModifiers.publicData);

       // System.out.println(AccessModifiers.protectedData); protected is NOT always accessible in different packages

      //  System.out.println(AccessModifiers.defaultData);  default is NOT accessible in different packages

      //  System.out.println(AccessModifiers.privateData); private is NOT accessible in different packages

        new AccessModifiers();  // public AccessModifiers Object can always accessible in different package


        AccessModifiers.publicMethod(); // only public is accessible
      //  AccessModifiers.protectedMethod();
      //  AccessModifiers.defaultMethod(); all three are not accessible in different package
      //   AccessModifiers.privateMethod()
    }
}

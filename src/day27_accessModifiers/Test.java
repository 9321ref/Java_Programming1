package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        //new StaticInitializationBlock();

        //calling static through class name "StaticInitializationBlock"
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("----------------------------------------------------------------");

        System.out.println(AccessModifiers.publicData); // public is accessible within same package .access modifiers classta var. ayni package icinde olunca visible
        System.out.println(AccessModifiers.protectedData);//protected is accessible within same package
        System.out.println(AccessModifiers.defaultData); //default is accessible within same package
       // System.out.println(AccessModifiers.privateData); private is not accessible  within same package

        new AccessModifiers(); // I can access  public 'AccessModifiers' constructors  with in same package

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
     //   AccessModifiers.privateMethod(); not accessible within same package
    }
}

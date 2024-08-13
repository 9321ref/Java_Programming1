package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    } // it does not take any arguments. only set instance variable.objecte göre execute olur

    static {
        System.out.println("Static Block");
    } // it does not take any arguments. only set static variable .birden fazla execute olmaz. objecte göre execute olmaz


    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();// her object icin instance block ve constructor yazilir.ama static bir kez yazdirir
        new StaticBlock_vs_InstanceBlock_vs_Constructor();


    }
}// execution firstly static secondly main method

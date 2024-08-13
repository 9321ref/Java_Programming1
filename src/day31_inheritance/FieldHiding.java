package day31_inheritance;

class A{

    public int a = 100; // this variable is hidden. it is not inherited to the Child class (subclass).Field hiding is implicitly
}

public class FieldHiding extends A {

    public int a = 300;

    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);
    }
}


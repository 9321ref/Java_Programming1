package utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier{

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.methodA();
    }
}

//protected it could be visible outside the package some condition, if it is in subclass.otherwise it cannot be accessible
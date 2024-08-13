package day27_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("Instance Block"); // instance block initialize instance variable
    }


    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
    }
}

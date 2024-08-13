package day13_customsMethods;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(20);
        System.out.println("--------------------------------------------");

        System.out.println("Test1 Started");


        boolean exit = true;
        if(exit){
            return; // main method gets terminated .you can not give any value because this is void
          //  System.out.println("hello"); after return statement any  statement unreadable ,useless
        }

        System.out.println("Test3 Completed");
        System.out.println("Test2 started");


    }

    public static void eligible(int age) {

        if (age < 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            return;  // exits the method.this method will terminate main method does not other method
            // if the age is invalid, then this method gets terminated sonlandiriyor return silince asagida ki kosuluda isleme geciriyor
            //invalid age:157   "You are not eligible to buy alcohol"

        }
         // bu baska if statement

        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }

    }

    public static int multiplication(int n1, int n2) {

        int result = n1 * n2;

        return result; // returns the value when exiting the method
        //   System.out.println("Hello"); after return statement ,can not readable this statement

    }
}

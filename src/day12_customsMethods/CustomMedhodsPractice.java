package day12_customsMethods;

public class CustomMedhodsPractice {

    public static void main(String[] args) {

        // if statement main methodta yazmak isteseydik her bir kosul icin coklu statement yazmak gerekcekti.bu yüzden custom method da ana kurali yazdik.
        // custom methoddan main methoda aktariliyor
        maxNum(10000, 5000);
        maxNum(100, 3450);
        maxNum(4000, 100);
        maxNum(10, 9000);
        maxNum(-100, -200);

        System.out.println("......................................");

        initial("Cydeo",  "School"); // C.S

        System.out.println("......................................");

        initial("Mohammad" ,"Karim"); //M.K

        initial("Refianur", "Enes"); // R.E
    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2){     // double icinde ,int double olur

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 +" is the maximum number");
        }else{
            System.out.println("Equal");
        }

    }

    //Create a method that can display the initials of a person  (firstName, lastName)

    public static void initial(String firstName ,String lastName){
        String initial = firstName.charAt(0) +"." + lastName.charAt(0);

        System.out.println("initial is : " + initial); // C.S

    }


}

/*
IMPORTANT
you should not pass any extra parameters ,when you created method.
If you pass any extra parameters that is not need it, when you call the method,
you ve to  provide those arguments every single time
at the video 3:23 min explain more detail
 */


package day13_customsMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(15));
        // different option
        int num = 15;

        if (isEven(num)) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
        System.out.println("-------------------------------------------");

        System.out.println(max(5,10)); // 10



    }



    public static boolean isOdd(int num){

        // return type is a boolean
       // return (num % 2 != 0)? true : false; other way
        if(num %2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int num){
        return !isOdd(num); // yukarda tanimlamanin tersi even dmektir .kisa bir sekilde yazdi
      //  return  (num % 2 == 0)? true : false; other way

    }

    public static int max(int n1, int n2){
       // return (n1 > n2) ? n1 : n2;

        if (n1 > n2){
            return n1;
        }else {
            return n2;
        }


    }


}


/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */

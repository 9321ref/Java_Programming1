package day14_forLoopAndOverLoading;

public class OddOrEvenReturn {

    public static void main(String[] args) {

        boolean result = isOdd(23);
        System.out.println(result);
        //     or
        System.out.println((isEven(25)));

        boolean result1 = isEven(24);
        System.out.println(result1);
        //     or
        System.out.println((isEven(24)));

        System.out.println("---------------------");

        boolean result3 = isEvenOrOdd(24);
        System.out.println(result3);
        //     or
        System.out.println(isEvenOrOdd(24));
    }

    public static boolean isOdd(int n){
        return n % 2 == 1;

    }

    public static boolean isEven(int n){
        return n % 2 == 0;

    }

//     You can write also with if statement

    public static boolean isEvenOrOdd(int n) {

        if(n %2 == 0){
            return true ;
        }else {
            return false ;
        }
}
}






/*

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false


	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */
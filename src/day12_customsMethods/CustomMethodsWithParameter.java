package day12_customsMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

       oddOrEven(100);       // <--- custom methods

        System.out.println("----------------------------------");

        oddOrEven(235);

        System.out.println("..................................");

         int num1 = 124;
        oddOrEven(num1);

         int num2 = 155;
        oddOrEven(num2);

    }


    // the method takes an argument number, add verifies if the number is odd number or even  number
    public static void  oddOrEven(int number){
        // method rakamsa variable gibi "parameter" ona göre olmali --> number ise int olmali
        // there is no Data you ll need to return from the method,if it not void that means, you must return a value


        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    public static void initial(String firstName, String lastName) {

        String initial = firstName.charAt(0) +"." + lastName.charAt(0);

        System.out.println("initial is: " + initial);
    }

    // create a method that can check if a person is eligible to buy alcohol

    // creat a method that can check if a number is odd, or even or zero

    // creat a method that can calculate the grade of the students (score)

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

    // creat a method that can display the initial of person (firstName, lastName) initial -> bas harflerini almak

}

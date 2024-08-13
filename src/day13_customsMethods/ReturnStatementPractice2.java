package day13_customsMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if(number < 1 || number > 7){
            System.err.println("Invalid Number: "+number);
            return; // exit the main method
        }

        System.out.println(  (number==1)?"Monday"  :(number==2)?"Tuesday"  :(number==3)?"Wednesday" :(number==4)? "Thursday"
                            :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday" );

    }

    public static class MathUtility {

        public static void main(String[] args) {

            int result = calculate(7, '+', 8);
            System.out.println(calculate(7, '+', 8)); //15

            System.out.println(calculated(3.5,'-',1.6)); // 1.9

            System.out.println(calculate(5.5,'/',2.5)); //2.2

            System.out.println(cube(3)); // 3³ = 27
            System.out.println(square(4)); // 4² = 16
            System.out.println("int num = " + square(4)); // int num = 16

            System.out.println(cube(2.5)); // 6.25
            System.out.println("double num = " + cube(2.5)); //  double num = 6.25


        }


        public static int calculate(int n1, char c1, int n2) { // c1 operator
            return c1 == '+' ? n1 + n2 : 0; //  15 eger operatör arti ise topla yoksa 0 döndür.. TERNARY ve RETURN kullandm
        }

        public static double calculated(double n1, char c1, double n2) { // 1.9
            return c1 == '-' ? n1 - n2 : 0;
        }

        public static double calculate(double n1,char c1 ,double n2){ // 2.2
            return switch(c1){
                case '+' -> n1+n2;
                case '*' -> n1*n2;
                case '/' -> n1/n2;
                default -> 0;
            };  // switch bu kisa yazilista noktali virgül var
        }

        public static int cube(int n1){
            return n1 * n1 * n1  ; // küpünü hesaplama
        }

        public static int square(int n){ //karesini hesaplama
            return n*n;
        }

        public static double cube(double n1){
            return n1*n1;



        }

    }
}

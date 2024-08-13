package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 +200); // 100 + 200 = 300
        System.out.println("100" + 200); // you can use String ("")


        System.out.println(40 - 10);
        //System.out.println("40" - 10); can not use ("") ~ compiler error because of ""

        System.out.println(50 / 6);

        System.out.println(50 / 6.0);
        System.out.println(50.0/ 6);
        System.out.println(50d / 6);

        System.out.println(2.5 / 0.5);
        System.out.println( (int) (2.5 / 0.5) );

       // System.out.println(9 / 0); compiler error can not divide in math also in java

        System.out.println(10 * 2);

        System.out.println("-------------------");

        System.out.println(100 % 10);

        System.out.println(100 % 13);
        System.out.println(45 % 8);

          



    }
}

  /*
        Arithmetics Rules
      in math:
	20 / 6 = 3.3333....

	9 / 0

    in java:
	20 / 6 = 3

	int / int ===> int value


	20 / 6.0 ===> 3.3333...

	int / double ==> double
	double / int ==> double
	double / double ==> double
         */

/*
 Modulus % rules

Remainder: numerator - (denominator * integer result)

		10 / 3 = 3.321231...

		remainder = 10  - (3 * 3) = 1


		20 / 6 = 3.3333...

		20 - (6 * 3) = 2


		15 / 4 = 3.75

		15 - (4 * 3) = 3



		10 % 3 ==> 1

		20 % 6 ==> 2

		15 % 4 ==> 3


 */
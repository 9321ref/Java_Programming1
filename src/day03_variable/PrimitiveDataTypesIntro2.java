package day03_variable;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType  variableName = Data
        // char: for single character ''

    char a = '@';
    char b = '!';
        /* char ab = 'ab'; error because char is only one character */
        System.out.println(a);
        System.out.println(b);

        System.out.println("____________________________________");

        char ch1 ='A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("______________________________________");

        //char ch3 = 80000; out of character numbers
        //char ch4 = -400;  out of character numbers

        char ch3 = 9000;

        System.out.println(ch3);

        System.out.println("______________________________________");

        int sum = 'A' + 'B';
        //         65 +  66 =  131

        System.out.println(sum); //  131


        System.out.println("______________________________________");

        // boolean r1 = 123;
        // boolean r2 = 2.5;  // all of it out of boolean
        // boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1;  // false

        System.out.println(r6);
        System.out.println(r7);


    }
}

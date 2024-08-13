package day22_arrayList;

public class A2WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1); // output :201

        // Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);  // --> Wrapper Class String Objecti(veriyi) primitive int value cevirdi

        System.out.println(num + 1); // 21 20 artik String degil integer

        Integer num2 = Integer.valueOf(str); // String convert into Wrapper class Integer

        System.out.println(num2);

        System.out.println(" 1----------------------------------------------------------");

        // primitive double does not have method to convert to String. there is class of that primitive double has the method
        // parse and valueOf that can help to convert this String to the primitive or to the wrapper class double.

        String s = "20.5";

        double num3 = Double.parseDouble(s); // parse method you will get prímitive double

        Double num4 = Double.valueOf(s);// valueOf method covert wrapper class

        System.out.println(num3); //20.5
        System.out.println(num4);//20.5

        System.out.println("2--------------------------------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x); // it will give you primitive boolean

        Boolean r2 = Boolean.valueOf(x); // get wrapper class Boolean

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("3------------------------------------------------------");

        char ch = '1';
        char ch1 = 'A'; // output: true because 'A' letter
        char ch2 = '$';


        boolean isDigit = Character.isDigit(ch); // digit means on ASCII table between 0 and 9

        boolean q2 = Character.isLetter(ch1);// true

        boolean q3 = Character.isLowerCase(ch1);// false

        boolean q4 = Character.isUpperCase(ch1);// true

        boolean isSpecialChar = !Character.isLetterOrDigit(ch2); // $ special character output: true

        System.out.println(isDigit);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
        System.out.println(isSpecialChar);

        System.out.println("4 -------------------------------------------------");

        String string = "a1b2c34e5";

        int sum = 0; // sum all digit and add to the num, 0 means we do not have yet any sum num

        for (char each : string.toCharArray()) { // charAtArray Stringte ki her bir karekteri bulmak icin. for each loop ile her bir karekteri yazdrcak.digiti bulmak icin

            if (Character.isDigit(each)) { //each character digit mi deilmi
                sum += Integer.parseInt("" +each);  //char ""+  ile Stringe casting yapti , stringi de parse method ile numbers convert yapti
                                                      // convert the character to the number
            }

        }
        System.out.println("sum = " + sum); // 15
    }
}

/*
Wrapper Class Methods
parse method: returns primitive type, converts String to primitive values

valueOf methods: returns wrapper class objects, converts String to wrapper class values
 */
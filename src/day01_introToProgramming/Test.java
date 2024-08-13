package day01_introToProgramming;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        // bu methodu ancak custom method olrak string utility class 'd  store yaparsam kullanabilirm
        String word = "Wooden Spoon";

        String result = StringUtility.reverse(word);

        System.out.println(result);//noopS nedooW

    }

}

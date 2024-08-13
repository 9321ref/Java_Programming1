package day08_ternary_Switch;

public class NumberToWord {

    public static void main(String[] args) {

        /*
        1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
         */

        int number = 1;

        String result = "";

        if (number >= 0 && number <= 9) {

            result = (number == 0) ? "Zero" : (number == 1) ? "ONE" : (number == 2) ? "Two" : (number == 3) ? "three"
                    : (number == 4) ? "four" : (number == 5) ? "five" : (number == 6) ? "six" : (number == 7) ? "seven"
                    : (number == 8) ? "eight" : "nine";
        } else {
            result = "Invalid Score";
        }

        System.out.println(result);







    }
}

package day222324_Task;

public class A1_LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden§%$789((3300";
        String letters = "";
        String digits = "";
        String specialChar ="";

        /*
     1) str.toCharArray() ifadesi, str isimli String nesnesini bir karakter dizisine dönüştürür.
     2) Karakter dizisinin her bir elemanı, orijinal stringdeki bir karaktere karşılık gelir.

     Bu metod, bir string'in içindeki karakterlerle işlem yapmanız gerektiğinde oldukça kullanışlıdır.
     Örneğin, string'in her bir karakterini ayrı ayrı ele almanız gerekiyorsa bu metodu kullanabilirsiniz.
         */

        for( char eachChar : str.toCharArray() ){ //
            if(Character.isLetter(eachChar)){
                letters += eachChar;
            } else if (Character.isDigit(eachChar)) {
                digits += eachChar;
            }else {
                specialChar += eachChar;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);


    }
}

/*
 Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */
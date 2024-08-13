package day11_stringMethod;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase(); // "cydeo school"

        System.out.println(str1);


        // ---------------------------------------------

        String str2 = "java programming";

       str2 = str2.toUpperCase(); // "JAVA PROGRAMMING"

        System.out.println(str2);

        //---------------------------------------------

        String word = "Wooden Spoon";

         word= word.toUpperCase();
         word = word.toLowerCase(); // en sonda ki data yi print ediyor. String worod1 -word2 dye tanmlarsan istedgin sonucu print eder

        System.out.println(word);

        //-------------------------------------------

        String str4 ="            Cydeo School"; // white space, still execute on the console

       str4 = str4.trim(); // "Cydeo School" // remove the space

        System.out.println(str4);


        //-----------------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w'); // find the method,index number of letter. index is a number that's why variable is int.

        System.out.println(index1);


        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a'); // java programming ~ there is two 'a'  that's why we mention firstA

        System.out.println(firstA);

        int secondA = s1.indexOf("a "); // index must be unique --> "a  "

        System.out.println(secondA);

        //------------------------------------------------

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python"); // ("a ") second way for second 'a'

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS"); //any characters from string  specify must be unique, then you ll be able to find next number

        System.out.println(a4);

        //-------------------------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); // 1

        System.out.println(w.lastIndexOf('a')); // 3 sondaki a harfinin index numarasini buluyor

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P')); // 29























    }
}

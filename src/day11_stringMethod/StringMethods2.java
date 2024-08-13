package day11_stringMethod;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "I love Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        //---------------------------------------------

        String word = "java";

        //word = word.replace('a','e'); // "jeve"  a harfini eskiden yeniye degistiryor yani e

        word.replace("a", "e"); // java ayni haliyle kaliyor

        System.out.println(word);

        //---------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2.replaceFirst("Java", "Python"); // I love Python, Java is cool

        System.out.println(sentence2);

        //---------------------------------------------

        String sentence3 = ("Java is fun, Java is cool, Java is amazing");
        //sentence3 = sentence3.replace("Java", "Python"); --> all the java replace by python

        sentence3  = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);


        //----------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1); // son harfi okumasi icin 1 eklenir

        System.out.println(languageName); //Java

        //-----------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789...

        String today = sentence5.substring(9, 14 +1); //--> Sunda ~ y:14 14+1 --> sunday

        System.out.println(today);

        //---------------------------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";

        int beginning = email.indexOf('@') + 1; // add 1, because exclude th character '@'. bu isaretten sonrasi icin böyle yazdik
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain); // gmail, yahoo ,hotmail..

        //---------------------------------------------

        String sentence6 = "I love Java programming";

       // String r1 = sentence6.substring(7, sentence6.length() ); Java programming
        String r1 = sentence6.substring(7); // index number from 7 to end index --> Java programming

        System.out.println(r1);

        //---------------------------------------------

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1); // after 'is' there is space
                                                                              //that is why ' '  + 1 and then comes --> Monday
        System.out.println(tomorrow);

        //------------------------------------------------------

        String sentence8 = "I study at Cydeo School";
        //                 01234567891011        after 11 comes Cydeo School


        String schoolName = sentence8.substring(11); // Cydeo School

        System.out.println(schoolName);

        //----------------------------------------------------

        String str = "Python";

        //String result = str.repeat(10); // ten times PythonPython...
        String result = (str + "\n").repeat(10);   // Python ten times bottom to bottom
                                                        //Python
        System.out.println(result);




















    }
}

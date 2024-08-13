package day11_stringMethod;

public class StringMethods3 {

    public static void main(String[] args) {

        //String word = "Java"; // false
        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //-----------------------------------------------------

        String str ="            "; // --> there is not empty there have character .that is mean, there is blank

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //--------------------------------------------

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2); // false because one of them are different keyword (new...)

        System.out.println(str1.equals(str2)); // true~ but if it is written in a one String and same case (lower upper) then it will be true  I mean equal

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));  // they don#t same character str2-> C , str-> c


        //-------------------------------------------------

        String s1 = "JAVA";
        String s2= "java";

        System.out.println(s1.equals(s2)); // false - different case (upper lower) cannot ignore case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2)); // true -same letter without case sensitivity


        //-------------------------------------------

        String students ="Hasan Naran Sumeyye Natalia";

        boolean hasAhmed = students.contains("Ahmed"); // false

        System.out.println("hasAhmed = " + hasAhmed);


        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java"); // hasJava~ true

        System.out.println("hasJava = " + hasJava);

        //---------------------------------------------------

        String name = "Micheal";

        boolean l = name.startsWith("Da"); // false start with Mi

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www");

        System.out.println(isValid); // true

        boolean t= url.endsWith(".com");

        System.out.println(t); // true

        // --------------------------------------------------

        String email ="CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.oom");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);








    }
}

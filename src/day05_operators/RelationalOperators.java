package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // all relational operators return Boolean (true or false)

         int a = 1000;
         int b = 200;

       // System.out.println( a > b);  // true

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("-----------------------------------");

        int score = 75;

        boolean passed = score >= 60;

        System.out.println(score);

        System.out.println(passed);

        System.out.println("-------------------------------");

        int score1 = 50;

        boolean passed1 = score1 >= 60;

        System.out.println(score1);

        System.out.println(passed1);

        System.out.println("-------------------------------------");

        int  age = 21;

        boolean eligibleToBuyAlcohol = age >= 21; // age > 21; false

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("-----------------------------------");

        System.out.println(100 > 100);
        System.out.println( 100 >= 100);
        System.out.println(100 >= 85);

        score = 48;

        boolean failed = score < 60;

        System.out.println(failed); // true

        System.out.println("----------------------------------------");

        System.out.println(100 < 1000); //true
        System.out.println(100 < 20); // false

        System.out.println("-------------------------------------------");

        System.out.println( 95 <= 1000); // true

        System.out.println(100 <= 100); //true

        System.out.println(10 <= 5); // false

        System.out.println("---------------------------------------------");

        //System.out.println( " Java" <= "CH"); compile error // <,>, <=, >= can only be applicable for numbers

        System.out.println( 'a' > 'b');// ASCII tabelasinda karekter karsiliginda ki rakama göre belirledi

        //                   65 > 66  char character oluyor cünkü her birinin sayi karsiligi var




    }

}

package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

         double salary = 60000;
         int creditScore = 650;
         int age = 25;


         boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18; // true
         //                           true         &&  true              && true

        System.out.println(eligibleForLoan); // true

        double salary1 = 90000;
        int creditScore1 = 500;

        boolean eligibleForLoan1 = salary1 >= 90000 && creditScore1 >= 650;  //false
        //                           true          &&     false

        System.out.println(eligibleForLoan1);

        System.out.println("------------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA"; //true

        System.out.println(eligibleToVote);

        System.out.println("---------------------------------------------");

        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no"; // false

        System.out.println(validAnswer);

        System.out.println("------------------------------------------");

        String answer1 = "no";

        boolean validAnswer1 = answer1 == "yes" || answer1 == "no"; // true
        //                         true                 true

        System.out.println(validAnswer1);

        System.out.println("--------------------------------------------");

        char grade ='B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam); // true

        System.out.println("--------------------------------------------");

        System.out.println( !true );

        String a = "yes";

        boolean yes = a == "yes"; //true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);

        System.out.println("no = " + no);

        System.out.println("-----------------------------------------------");

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


        System.out.println("-------------------------------------------------");

        System.out.println( true == !false  &&  false  ==  !true  &&  true != !true );
        //                     true          &&          true      &&   true            != -> does not equel










     // && both
     // || either ya o ya bu








    }
}

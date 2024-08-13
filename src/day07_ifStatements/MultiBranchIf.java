package day07_ifStatements;
 /*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
  */
public class MultiBranchIf {
     public static void main(String[] args) {

         int num = 100;

         String result = "";

         if(num > 0){
             result = "Positive";
         }

         if(num < 0){
             result = "Negative";
         }

         if(num == 0){
             result = "Zero";
         }

         System.out.println(result);

         System.out.println(".............................................");

         String result2 = "";

         if(num > 0){
            result2 = "Positive";

         }else if (num < 0){
             result2 = "Negative";

         }else {
             result2 ="Zero";
         }

         System.out.println(result2);

         /*
           Single if: for one condition

     If & Else: when there are TWO (not more, not less than 2) options/possibilities/alternatives we need to create condition for

            for 2 conditions
............................................................
        Multibranch If: when there are three more options/possibilities/alternatives we need to create condition for

          for three or more conditions

        if(Condition1){
            StatementA
        }else if(Condition2){
            StatementB
        }else if(Condition3){
            StatementC
        }else{
            StatementD
        }


        ONLY one block gets executed

        StatementA: Condition1 is true

        StatementB: Condition1 MUST be false, Condition2 is true

        StatementC: Condition1 & Condition2 MUST be false, condition3 is true

        StatementD: Condition1 & Condition2 & Condition3 must be false


          */



     }
}

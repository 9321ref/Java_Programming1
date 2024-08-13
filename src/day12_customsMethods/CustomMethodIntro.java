package day12_customsMethods;

public class CustomMethodIntro {

    public static void main(String[] args){   // building method

        System.out.println("Test started");

       greetings();

       System.out.println("Test Completed");

        System.out.println("-------------------------------------");

        displayMessage();


    }


     public static void greetings(){ //bu pararagrafla yukardakini degistirsende fark olmaz.sadece dogru methodla yazmak önemli
         System.out.println("Hello Cydeo"); // print statement  / method must be in the class
         System.out.println("How are you today?");
         System.out.println("Are you ready to learn Java");

     }

     public static void displayMessage(){
         System.out.println("Hello World");
         System.out.println("I love Java");
     }
}

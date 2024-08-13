package day11_stringMethod;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

      //  craig_federighi@apple.com

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();
        input.close();

        String firstName = email.substring(0,email.indexOf("_"));//craig
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));//federighi
        String domain = email.substring(email.indexOf("@")+1 ,email.lastIndexOf(".")); //apple

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);//Craig
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);//Federighi

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);







    }
}

/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */

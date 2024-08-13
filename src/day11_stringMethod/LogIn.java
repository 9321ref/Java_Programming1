package day11_stringMethod;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);


        String correctUsername = "Cydeo",
                correctPassword = "WoodenSpoon";


        System.out.println("Enter the username:");
        String username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close(); // i don't need any more scanner or Enter something that's why I close it

        if(username.equals(correctUsername)  && password.equals(correctPassword) ){
            System.out.println("You are now logged in!");
        }else{
            System.out.println("Incorrect username or password.Please try again");
        }







    }
}




/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */
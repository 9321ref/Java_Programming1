package day11_stringMethod;

public class calledEmail {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0,email.indexOf("_")); // sadece 0 olsaydi mike ve sonra ki bütün cümleyi alcak ,
                                                                  // ama under scor ekleyince yani underscore a kadr olsun dyor, o zaman sadece mike olur
        String secondName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        email = secondName+"_"+firstName+domain;



       System.out.println(email);




    }

}










/*
6. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */
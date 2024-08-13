package day16_nestedLoop;

import java.util.Scanner;

public class LogInDoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3; // 3 kez grisimde bulunabilrsn

        do {
            System.out.println("Enter your username");
            u = input.next();

            System.out.println("Enter your password");
            p = input.next();

            attempt --; // 3 hakkin her kullandikca azalmasini ifade edyor

            if (attempt == 0){ // eger girimde bulunma hakkin kalmadysa
                break; // hakkin btince code duruyor execute olmuyor
            }


        }while( !(u.equals("Cydeo") && p.equals("Wooden"))); // while the credentials are incorrect
                                                          // bu statemente bakmaz do önmli olan
                                          // eger body loop execute olsun istyorsak do while kullanirsin.
    }
}

package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();

        input.nextLine(); // Enter . eger nextInt den sonra(veya dger method) nextLine kullanacaksan ikisinin arasina nextLine kodu greceksin
                          // yoksa nextLine ile yazdgin code'a icerik yazamazsin.
                          //we have to give etra nextLine () method if we are using a nextLine()method after the other methods of scanner


        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);

        input.close();


    }
}

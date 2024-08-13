package day24_dateAndTime;

import java.time.LocalDate;

public class A4_LocalDayIntro {

    public static void main(String[] args) {

        // LocalDate is immutable ,do not change
        // static method now(); current day

        LocalDate today = LocalDate.now();//2024-07-20
        System.out.println(today);

        //static method of(); days months years
        LocalDate birthday = LocalDate.of(1995,02,21);

        System.out.println(birthday);

        System.out.println("----------------------------------------------------------");

        //      Methods of LocalDate Object

        System.out.println( today.getYear() ); //2024

        System.out.println( today.getMonth()); // July

        System.out.println( today.getMonthValue()); // --> 7 (temmuz ayi) today's LocalDate

        System.out.println( today.getDayOfWeek()); //today Saturday

        System.out.println( birthday.getDayOfWeek()); // 1995 02 21 --> tuesday

        System.out.println( today.getDayOfMonth()); // 20 --> today 20.

        System.out.println( today.getDayOfYear()); // yilin 202. günü

        System.out.println("-------------------------------------------------------");

        //yukarda LocalDate object olusturduk bir dha yazmiyoruz --> LocalDate today = LocalDate.now();
/*
        today.plusYears(1);
        System.out.println(today); //2024-07-20 datum didn't change. because LocalDate is immutable. I have to creat new object or uptade( assign variable)
*/

        today = today.plusYears(1); // assign to the new variable
        System.out.println(today); // 2025-07-20 now increase year

        System.out.println("----------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2012,6,15);

        graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate); //2014-06-15

        graduationDate = graduationDate.plusMonths(7); // her yeni bir islem icin updated yapmalisin.immutable oldugu icin
                                                                   // yoksa üste ki 2014-06-15 tarihi gösterir
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7); //add 7 weeks

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100); //2015-06-13

        System.out.println(graduationDate);

        System.out.println("-------------------------------------------------------");

        LocalDate myBirthday = LocalDate.of(1993,10,21);
        LocalDate myBrotherBirthday = myBirthday.minusYears(3).minusMonths(9).minusDays(18);

        System.out.println(myBirthday); //1993-10-21
        System.out.println(myBrotherBirthday); //1990-01-03

        LocalDate birtday1 = LocalDate.of(1994,10,1);
        LocalDate birtday2 = LocalDate.of(1993,06,16);

        boolean r1 = birtday1.isEqual(birtday2);

        System.out.println(r1); // false

        System.out.println("----------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2024,12,30);

        System.out.println(  grad_date.isBefore( LocalDate.of(202,11,26))); // false
        System.out.println(  grad_date.isAfter( LocalDate.of(2023,9,23))); // true


        System.out.println("------------------------------------------------------");

        // leap year means february has 29 days
        System.out.println( LocalDate.of(2024,07,20).isLeapYear()); // true





    }
}

package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class A2_DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern(" EEEE ");

        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.format(df)); // ofPttern(y) formatyla sadece yilin 4 rakamini yazdi.
                                             // yy yazinca yilin iki rakamini yazar -> 24.
                                            // M yazinca bulundugun ayi yazacak -> 7
                                            // MM -> 07    MMM -> Jul    MMMM -> July  d -> 23  dd -> 01,02..09
                                           // y/MMMM -> 2024 July   "y MMMM d" -> 2024 July 23
                                          // EEEE -> Friday  E -> Mon Tue
                                          /*
                                          y -- year of era
                                          M -- month of year
                                          d -- day of month
                                          E -- Day of week
                                           */

        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df)); // July-01-22

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime time1 = LocalTime.of(17,5); // --> pm
        System.out.println(time1.format(tf));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf)); // starts variable assign yapildigi methoda göre print yap. yani cuurent hour



    }
}

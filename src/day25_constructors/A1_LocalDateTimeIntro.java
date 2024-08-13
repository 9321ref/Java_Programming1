package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A1_LocalDateTimeIntro {

    public static void main(String[] args) {

       LocalDateTime starts = LocalDateTime.now();  // LocalDateTime starts =  declare variable as "starts" /LocalDateTime.now() -> object
        System.out.println(starts);

    // LocalDateTime declare variable =  assign to the LocalDateTime Object
       LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());// yukarda yazdigmiz hazir methodu kullanarak su an ki günü verir

        System.out.println(starts.getHour());// su an ki saati veryor

    }
}

package day24_dateAndTime;

import java.time.LocalTime;

public class A5_LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10,30);

        System.out.println(starting_time); // 10:30

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime); // 00:01 simdi ki saati buldu

        System.out.println("---------------------------------------------");



        LocalTime time1 = LocalTime.of(23,6,55); // 24 kabul etmiyor 00:00 old icin
        System.out.println(time1);

        time1 = time1.plusHours(1); // plusHours gives new object .local time is immutable , we need to assign to back to contain new value (time1 = ..)
        System.out.println(time1); //00:06:55

        time1 = time1.plusMinutes(20);
        System.out.println(time1); //00:26:55
    }
}

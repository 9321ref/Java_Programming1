package day23_arrayList;

import java.util.ArrayList;

public class A3RemoveDuplicates {

    public static void main (String [] args){


        //contain methods
        ArrayList<String> names = new ArrayList<>();

        names.add("Ayse");//0
        names.add("Ayse");//1
        names.add("Enes");
        names.add("Elif");
        names.add("Ali");
        names.add("Ahmet");// 5

        //[Ayse, Ayse, Enes, Elif, Ali, Ahmet]

        System.out.println(names);

        //tekrar edilmeyenleri baska bir listeye ekleme icin new ArrayList olusturduk
        ArrayList<String> nonDupli = new ArrayList<>();

        for(String each : names){ // names listesinde ki her bir öge kontrol ediliyor
            if(nonDupli.contains(each)){ // non.dupli listesi each ögesinini iceriyorsa "contain methoduyla kontrol ediyor" aynisi varsa continue ile skip yapar dger isme gecerz.
                continue;
            }
            nonDupli.add(each); //aksi takdirde each nonDupli listesine ekleniyor.( iki kez gecmeyenler)

        }

        //[Ayse, Enes, Elif, Ali, Ahmet]

        names = nonDupli; // this reference variable names, it was referencing [Ayse, Ayse, Enes, Elif, Ali, Ahmet].
                          // now names variable is referencing to new Object "nonDupli"


        System.out.println(nonDupli);
    }
}

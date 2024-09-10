package day38_exceptions_handling;

import utilities.Library;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordDisadvantage {

    public static void main(String[] args) throws InterruptedException{

        method1(); // bu methodu da  pauseFor5Seconds(); ayni nedenden dolayi direk kullanamayiz
        Library.sleep(3.5); // utility de handle yaptik.try catch ile burada cagirabiliyorz

    }


    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);
    }


    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds(); //yukardaki method ignore yaptik kendi icinde problem yok ama handle olmadi ve baska bi yerde bu yzden call yapamayiz
        // bu yüzden tekrar temporary olarak throws keyword kullncaz hangi nedenle compile error oluyorsa
        System.out.println("Hello Cydeo");
    }
    /*
    throws keyword: used for handling checked exceptions ONLY
    caller of the method will be responsible for handling the exception
     */

        public static void method2 () throws InterruptedException, FileNotFoundException
        { //-> Exception class koyunca her classin problemini cözer .bir dha FileNotException yazmaya gerek kalmaz

            System.out.println("First program started");

            Thread.sleep(3000);

            System.out.println("First program ended");

            new FileInputStream(" ");


            Thread.sleep(5000);


        }
    }


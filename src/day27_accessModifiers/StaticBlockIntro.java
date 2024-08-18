package day27_accessModifiers;

public class StaticBlockIntro {

   public StaticBlockIntro(){
       System.out.println("Constructors");
   }//"Using Constructors for initializing instance variables
    // because each object could have seperate copy of instance variables

    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlockIntro();
        new StaticBlockIntro();
        new StaticBlockIntro();

    }

    static{
        System.out.println("Static Block"); // used for code execution, Whether it comes before or after the main method does not matter; the static block executes first.
    }                                       // static block accept just static variable
}
/*
Doğrudan Değer Atama: Basit ve hızlı bir başlangıç için kullanılır. Sabit değerler için uygundur.
Statik Blok: Karmaşık başlatma işlemleri veya dinamik değer atamaları için kullanılır. Daha fazla esneklik sağlar.
 */
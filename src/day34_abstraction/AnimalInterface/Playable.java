package day34_abstraction.AnimalInterface;

public interface Playable {

   boolean isFriendly = true; // this variable static & final by default. //public static final booleandan önce yazabilriz ama gri olur gereksiz implicitly yzilir
/*
   private static void main(String[] args) { // public yazilabilir.
       System.out.println(isFriendly); // static oldugu icin main static yazabildik

      // isFriendly = false; final oldugu icin degisemez.compile error
    }

    default void method1(){

    }

 */

     void play(); //-> abstract method in interface ~ public abstract given by default
}

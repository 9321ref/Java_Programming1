package day25_constructors;

public class A3_ConstructorsIntro {

     public A3_ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");
     }

     public A3_ConstructorsIntro(int a) {  // iki ayni constructor olamaz,overloaded olmali
         System.out.println("Object is created by using int argument constructor");
     }


    public static void main(String[] args) {

       //A3ConstructorsIntro sinifindan bir nesne olusturuluyor
        A3_ConstructorsIntro obj1 = new A3_ConstructorsIntro(10);
        A3_ConstructorsIntro obj2 = new A3_ConstructorsIntro();
      //  A3_ConstructorIntro obj3 = new A3_ConstructorIntro("java"); // combile error -> String constructor olusturmadik

    //.....Rule....
     //1-Constructor name has to same with class name.
    //2-Constructor does not have return type.
    //3- Execution of Constructors always depends on the OBJECT "int a, string b, ..." it will be pop up on the console which type is given

    }
}

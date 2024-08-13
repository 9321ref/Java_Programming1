package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        //Garbage Collection makes all process automatically

        String a = ""; // this is object
        String s1 = "Java";
        s1 = null; // reference null this is not object , "Java" will be eligible for garbage collection. (java delete).

        System.out.println(s1);

        System.out.println("------------------------------------------");

        String str1 = "Python";
           str1 = "Cydeo";

        System.out.println(str1);// cydeo --> garbage collection delete "python"
                        // because str1 reference by or reassigning new object " Cydeo"

        System.out.println("----------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki","Chow chow",'M',3,"Medium","Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck","Bulldog",'M',5,"Small","white");


        // garbage collection two ways
      // 1)  dog1 = null; dog1 eligible garbage
      // 2)
             dog1 = dog2;  // dog 1 eligible garbage

        System.out.println(dog1);
        System.out.println(dog2);
/*
Dog{name='Chuck', breed='Bulldog', size='Small', gender=M, age=5, color='white'}
Dog{name='Chuck', breed='Bulldog', size='Small', gender=M, age=5, color='white'}
 */



    }
}

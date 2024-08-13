package day14_forLoopAndOverLoading;

public class ForLoopPractice {


    public static void main(String[] args) {
/*

                // print it infinite time cünkü decreament yaparak 10 dan geriye sonsuz gidiyor
               // true 5 < 10 then it ll be run,but infinite time "logical error"
        for(int i = 5;  i < 10; i--){
            System.out.println("Hello Cydeo");
        }

        // System.out.println("hello world"); // logical error .this statement never execute
  */

                                          //i: 10,9,8,7,6,5,4 (4>=5 false) then code block stop, not repeat
                                          //    1, 2,3,4,5,6
        for( int i = 10; i >= 5; i-- ){  // i: 10 cond :true body ll be print
            System.out.println("Hello World");
        }


        System.out.println("--------------------------------------------------");

       // sum of all the numbers 1 ~ 100

        int sum = 0; //  sifira hangi sayi eklersen ekle ekledigin sayiyi elde edersin. 1-100 e kadar olan sayiyi toplmak icin

        for( int i =1; i <= 100; i++){
            sum += i; // toplam gibi br degiskentanimladi "0" (1+0=1 ,2+0=2 ....100  1+2+3+...+100 =5050
        }

        System.out.println(sum); // 5050if I need to print the value of this variable  out of the loop because we do not need to repeat the statement.(it is not in the Loop)

        System.out.println("-------------------------------------------------------");


         // print all the alphabet letters A~Z

        for(char i = 'A'; i <= 'Z'; i++){

            //System.out.println(i);A B C D.... z (alt alta)
            System.out.print(i + " "); // B C D E .......Z

        }

        System.out.println();// for new line
        System.out.println("hello world");

        System.out.println("------------------------------------------");

        // print all the alphabet letters A~Z

        for( char i = 'Z'; i >= 'A'; i--){
            System.out.print(i +" "); // Z Y X W V ....A
        }

      // System.out.println(); without this statement cydeo comes after the letters Z Y X.......A cydeo
        System.out.println("cydeo"); // with new line statement ,cydeo come end of the letters in the new line



       // print all the alphabet letters in backwards



    }




    }


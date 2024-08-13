package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 4) { // 4, 2
                continue;
            }
            System.out.println(i); // 4 atladi 2 atladi
        }


        System.out.println("-------------------------------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // if 'i' is even
                continue; // skips the current iteration
            }
            System.out.println(i); // 11 13 15 17 19 ikiye bölunenleri atladi yani skip yapti onun disinda olanlari print yapti

        }

        System.out.println("---------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E') { //neden && degil, cünkü 'i' sadece bir karekter olabilir i: A B C D E F G. bu yüzden
                continue;                  //|| kullandik yani ayri ayri karekteri ele alarak
            }
            System.out.println(i); // skip 'A' 'E'

        }
        System.out.println("---------------------------------------");


        //find the sum of all the even number between 50 ~ 100
        //                     3 SOLVING WAYS;
//1)
        for (int i = 50; i < 101; i++) {
            if(i % 2 == 0){
                System.out.print(i +" "); // 50 52 54 56 .......100  //  ### yan yana yazmasi icin print() ###
            }
        }

        System.out.println();


//2)            // 50, 52 ,54 ,56.....100
        for (int i = 50; i < 101; i += 2) {// i++ increase by 1 - we need increase 2 then ,i += 2. tek sayilar cikarip even numberda bulunabilr continue branch statement ile
            System.out.print(i +" "); // 50 52 54 56 .....100
        }

        System.out.println();
//3)
        for (int i = 50; i < 101 ; i++) {
            if(i % 2 != 0){ // eger baslangic sayisi 2 tam bölmüyorsa skip it atla yani o sayiyi alma
                continue; // skip it
            }
            System.out.print(i +" "); // 50 52 54 56 ...100
        }

    }

        }





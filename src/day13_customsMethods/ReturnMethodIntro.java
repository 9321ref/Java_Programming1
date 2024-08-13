package day13_customsMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

      //  int total = sum(20, 40); // sum is a void method, does not return any data

        int total = addition(10,20); // return de data main body ' den console aktarilir.println statement yazilir yani.
                                     // void de main body de println yazilmaz.sonucu return yapmaz *yukarda ki örnege bak*
        System.out.println(total); // 30

        int total2 = square(10);
        System.out.println(square(10));// 100 System.out.println(total2); // 100

        int total3 = cube(5);
        System.out.println(total3);  //System.out.println(cube(5)); böylede yazilir // 125


    }

/*    public static void sum(int n1, int n2){

        int result = n1 +n2;
        System.out.println(result);

    }

 */

    public static int addition(int n1, int n2){

        int result = n1 + n2;
        return result;  // or return; n1 +n2 (without int result)
                        //eger result tanimlamadysan bu sekilde de yazabilrsin böylece tanmlanmis oluyor



    }


    public static int square(int num){

        int square =  num * num;

        return square;
    }



    public static int cube(int num){
        int cube =square(num ) * num;// variable name and method name can be same ,does not matter (cube)
               //= num*num yukarda tanimlandgi icin bu sekilde yazabilirz
        return cube;





    }



}

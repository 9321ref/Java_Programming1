package day14_forLoopAndOverLoading;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {

        System.out.println( sum(10,20 )); // 30

        System.out.println( sum(10,20,30));//60

        System.out.println( sum(10,20,30,40));//100

        System.out.println( sum(1.5,2.5)); //4.0

        System.out.println( sum(2.5,3.5,4.5)); //10.5

        System.out.println( sum(1.5,10.5,20.5,30.5)); // 63.0

        System.out.println( sum(10,20.5)); // 30,5 iki degerli int ve double method kullanilir .double olarak return olur sonuc

    }


    public static int sum (int num1,int num2){
        return num1 +num2;

    }

    public static int sum(int num1,int num2,int num3){
        return sum(num1,num2) +num3;
    }

    public static int sum (int num1,int num2,int num3,int num4){
        return sum (num1,num2,num3) +num4;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;

    }

    public static double sum(double num1,double num2,double num3){
        return sum(num1,num2) +num3;
    }

    public static double sum(double num1,double num2,double num3,double num4){
        return sum(num1,num2,num3)+num4;
    }
}
// method un return data type farkliveya ayni olabilir "double sum - int sum" gbi,ama parameter method must be different
// any method can be overloaded
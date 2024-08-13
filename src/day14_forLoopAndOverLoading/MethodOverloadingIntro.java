package day14_forLoopAndOverLoading;

public class MethodOverloadingIntro {

// ayni isimle ayni perameter tek sinifta olamaz.ya parameter yada method farkli isim olmali yoksa COMBInE ERROR verir
//over loading te ayni method adi ile olmali bi class icnde.
    public static void methodA(){

    }

    public static void methodA(int a){

    }

    public static void  methodA(double c){ // int a verirsek combine error verir,bu yüzden farkli variable kullnmak lazim parameter icin

    }


    public static void methodA(int a ,int b){ // sadece int b ,yne error verir.cünkü yukarda ki parameter ile ayni variable "int"
                                             //increase number of the parameters if it the same parameters

    }


}

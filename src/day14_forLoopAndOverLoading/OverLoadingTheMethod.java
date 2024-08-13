package day14_forLoopAndOverLoading;

public class OverLoadingTheMethod {

    public static void main(String[] args) {

        System.out.println("A"); // only method result executed. hali hazirda sytem java library de olan orada kurulu olmus ilk method execute olur.
                                 // asagida senn define ettigin .bu system java library de degil.you creat it. ve asil(real) main method ilk yazdimiz
                                 //main method overloading olur ama bu methodu java file de run yapamazsin,real main method gbi bu yzden gerekli deil .yukarda ifade edildgi nedenden dolayi

       // bu custom method olmazsa asagida ki bilgiler execute olmaz
        main(25);// B
        main(2.05);// C
        main(true);// D
    }



    public static void main(int args) {// parameter is can not be String because first Method's parameter is also String

        System.out.println("B");
    }

    public static void main(double args) {

        System.out.println("C");
    }

    public static void main(boolean args) {

        System.out.println("D");

    }

}

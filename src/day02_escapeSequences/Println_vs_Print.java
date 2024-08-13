package day02_escapeSequences;

public class Println_vs_Print {

    public static void main(String[] args) {
        System.out.println("Hello everyone");
        System.out.println("How are you today?");

        System.out.println("-------------------------------");

        System.out.print("Hello everyone");
        System.out.print("How are you today?");

        System.out.println(); // yeni satira atladi
        System.out.println(2);

        System.out.println("------------------------------------");
        int x = 10;
        System.out.println(++x); //11 // parantez icnde islemi yapmasi icin dounle qoute yok

        System.out.println("++x"); // parantez icini disari atmak icin double qoute

        System.out.print(2);
        System.out.println(); // burasi olmasa, print println verisi ynina yazar 23 gibi
        System.out.println("3");

    }


}

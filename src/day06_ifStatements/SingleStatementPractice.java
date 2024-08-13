package day06_ifStatements;

public class SingleStatementPractice {

    public static void main(String[] args) {

        int number = 155; // eger bu sayi boolean variable kosulu sagliyorsa console' da dogru olan tanimi verir

        boolean isEven = number % 2 == 0;

        if (isEven){
            System.out.println("Even number");

        }

        if(!isEven) {
            System.out.println("Odd number");
        }

        System.out.println("--------------------------------------------");

        if(number % 2 == 0) {
            System.out.println("Even number");
        }

        if (number % 2 != 0) {
            System.out.println("Odd number");
        }

//those solutions produce same same result
    }
}

package day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon" );
        }

        // 5 kez tekrar tekrar yazmamak icin nestedloop kullaniriz. yukarda her biri 5 kez yazarsa 25 kez
        System.out.println("------------------------------------------");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) { // ayni i degerini veremyorsun .yani icerdeki loop, dis forloop 5 kez yazdi
                System.out.println("WoodenSpoon"); // 25 kez yazdi .
            }

        }
    }


}

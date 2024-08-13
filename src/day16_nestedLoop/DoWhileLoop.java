package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ;){
            System.out.println("Hello ------ ForLoop"); // not executed because condition false
        }
        System.out.println("-----------------------------");

        while (condition){
            System.out.println("Hello ----- While Loop");// condition false it is never executed
        }

        System.out.println("-----------------------------");

        do{
            System.out.println("Helle -----Do&While Loop"); // it will be executed even it is false (at least once)
        }while(condition);                                  // once executed because false. if boolean condition is true ,it can execute repeat it
    }

}

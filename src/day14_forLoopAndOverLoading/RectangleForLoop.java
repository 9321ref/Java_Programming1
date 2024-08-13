package day14_forLoopAndOverLoading;

public class RectangleForLoop {
    public static void main(String[] args) {

     //---------NESTED LOOP---------//

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
    for (int i = 0; i < 9; i++) {

            System.out.println("* * * * * * * *");


        }
    }
}
 */
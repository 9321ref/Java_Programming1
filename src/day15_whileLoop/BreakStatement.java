package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {


            if(i == 6){ // if it is value reaches 6 .  if statement is true then statement  will be terminated .
                break; // exits the loop
            }
              System.out.println(i);
        }


       //.......................................................

        for (char i = 'A'; i < 'Z'; i++) {

            System.out.println(i); // if you use print statement after  the break ,it can not any result give .statement is terminated. (unreadable)
                                   // that's why it can be used before break,if you print what you want
            if(i == 'J'){
                               // -> print statement it can be before break. it can be readable
                break;
            }

            //.............................................

        }
    }
}

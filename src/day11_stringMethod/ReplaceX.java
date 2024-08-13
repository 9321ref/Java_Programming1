package day11_stringMethod;

public class ReplaceX {
    public static void main(String[] args) {

        String word = "xcodeX";

        word = word.replace('x' ,'a');
        word = word.replace('X' ,'a');

         word = word.replace('x', 'a').replace('X','a');

        System.out.println(word);

    }
}

/*

2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
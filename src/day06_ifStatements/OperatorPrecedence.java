package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);  // multible firstly
        //                   5 + 6

        System.out.println( 7 + 3 - 2 / 2 ); // division bigger than addition or subtraction ~ Order of precedence göre
        //                  7 + 3 -   1 ===> 9

        System.out.println( -5 + 3 ); // unary negation bigger than addition
        //                  -2

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                    true == false && "Java" == "Python" || 'a' == 'A'
        //                        false     &&    false           ||   false
        //                            false  || false
        //                                 false

        System.out.println(100 >= 20 && 40 * 2 > 60 );
        //                 100 >= 20 && 80 > 60
        //                  true  &&  true
        //                       true



        int a = 20;

        a += + 2 * 3;
        // a += 10 + 6
        // a += 16 --> a increase 16 ,then it'll be 36
        // a = 36


/*
Order of Precedence              Operators              Description
1                                   - !               Unary negation, logical NOT (opposite !yes -> no)
2                                   * / %             Multiplication, division, modulus
3                                    + -              Addition, subtraction
4                                  < > <= >=          Less than, Greater than, Less than or Equal to,
                                                      Greater than or equal to
5                                   == !=             Equal to, not equal to
6                                    &&               Logical AND
7                                    ||               Logical OR
8                              = += -= *= /= %=       Assignment and combined assignments


 parantez icinde ki islem, order sirasina göre büyüklüge göre yapiliyor   ~ carpma toplmadan büyük
 */




    }
}

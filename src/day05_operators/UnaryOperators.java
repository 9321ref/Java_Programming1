package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {


        // pre increment/decrement
        int x = 10;

        System.out.println(++x); //11
        System.out.println(x); // 11 <- call variable

        int y = 100;

        System.out.println(--y); //99
        System.out.println(y); // 99 call variable

        System.out.println("-----------------------------------");

        //post increment/decrement
        int a = 50;
        System.out.println(a++); // 50 hemen value degismiyor.önce eski value aliyor
        System.out.println(a); //51  ikinci asamada degeri increase 51 oluyor

        int b = 25;
        System.out.println(b--);// 25 önce eski value
        System.out.println(b); // 24 ikinci asama degeri decrease oluyor

        int n = 30;

        int m = n++; // m = 30 , n = 31

        System.out.println(n); // 31
        System.out.println("n = " + n); // n = 31
        System.out.println("m = " + m); // m = 30  önce variable  eski value geliyor


        int z = 60;

        int q = z--; // q = 60

        System.out.println("z = " + z); // 59
        System.out.println("q = " + q); // 60

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000; // balance = 1600 + 10000
        //--------------------------------------------------
        
        balance -= 1000; // balance = 11600-1000
        System.out.println("balance = " + balance);
        
        balance -= 5000; // 10600 - 5000
        System.out.println("balance = " + balance);


        System.out.println("------------------------------------");

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println(salary);


        salary *= 3;
        System.out.println(salary); // 270000


        System.out.println("-----------------------------------------");


        double eth = 4;
        eth *= 250; // 4 * 250
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth); // 1000 / 2

        System.out.println("--------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;

        System.out.println("salary = " + salary);

        System.out.println("------------------------------------------------");

        int c = 39;

        c %= 7; // c = 39 % 7

        System.out.println(c);




        









        System.out.println("------------------------------------------");

        System.out.println("++x"); // parantez icini disari atmak icin double qoute
                                   // parantez icnde islemi yapmasi icin dounle qoute yok


    }
}


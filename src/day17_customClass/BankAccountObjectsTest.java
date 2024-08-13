package day17_customClass;

public class BankAccountObjectsTest {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();

        obj1.setInfo("Refia",1234455566);
        System.out.println(obj1);

        obj1.deposit(1000);
        obj1.checkBalance(); // sout ypmiyoruz cünkü void method ile yazilmis return olmaz


        obj1.withdraw(700);
        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(5000);
        obj1.checkBalance();

        System.out.println("-------------------------------------");

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setInfo("Enes",789384883);
        account2.setInfo("Refianur",1234895786);

        account1.deposit(5000);
        account2.deposit(3000);

        account1.withdraw(1000);

        System.out.println(account1);
        System.out.println(account2);











    }


}

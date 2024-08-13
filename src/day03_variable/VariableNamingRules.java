package day03_variable;

public class VariableNamingRules {

    public static void main(String[] args) {

      // age of the student is 28
      // salary is 10000

        int age = 28;
        int salary = 10000;

       /* int age = 32; error -Variable Name must UNiQUE yukarda age 28 denildigi icin,ayni main kodun altinda bir
                        // daha age hakkinda yeni icerik yazilamaz. age1 28 olabilir */

        System.out.println(age);
        System.out.println(salary);

        int phoneNumber = 123456789; // camel case

        double salaryBeforeTax = 100000.5;
        double salaryBefore_tax$ = 80000.5;

        System.out.println("____________________________");

        // int 1number = 10; can not start with digits

        // int number = 10;
        // int number = 20;   can not be same variable name
        // int number = 30;

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        //double abstract = 5.5; //variable named can not be java reserved words
        //double long = 5.7;

        System.out.println("____________________________");

        //String: for String of texts ""
        // gender is male
        String gender = "Male";
        String fullName ="Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);



    }


}

package day17_customClass;

public class itemClients {

    public static void main(String[] args) {

     Item pen = new Item();
     pen.name = "blue pen";
     pen.unitPrice = 3.5;
     pen.quantity = 3;

        System.out.println(pen); //Item{name='blue pen', unitPrice=3.5, quantity=3}
        System.out.println(pen.calcCost()); // 10.5

     Item notebook = new Item();
     notebook.name = "Asus";
     notebook.unitPrice = 2500.0;
     notebook.quantity = 2;

        System.out.println(notebook);//Item{name='Asus', unitPrice=2500.0, quantity=2}
        System.out.println(notebook.calcCost()); // 5000





    }


}


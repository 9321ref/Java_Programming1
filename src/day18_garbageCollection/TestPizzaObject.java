package day18_garbageCollection;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

      //  pizza1.size = 'M';

         pizza1.setInfo('M',3 , 5 );


        Pizza pizza2 = new Pizza();

     //   pizza2.size = 'S';

        pizza2.setInfo('S',2,4);

        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("-----------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S',2,4);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',3,5);
            total += medium.calcCost();


            Pizza large = new Pizza();
            large.setInfo('L',3,6);
            total += large.calcCost();
        }

        System.out.println("total = " + total);
    }
}

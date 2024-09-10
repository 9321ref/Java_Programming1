package day36_Tasks;

import day34_abstraction.Car_task.Audi;
import day34_abstraction.Car_task.Car;

import day34_abstraction.Car_task.Honda;
import day34_abstraction.Car_task.Tesla;

import java.util.ArrayList;


public class CarShop {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };
/*Solution 1:murodilin cözüm
        for (Car each : cars) {
            int year = each.getYear();
            boolean forHonda = each instanceof Honda && year >= 2010 && year <= 2011;
            boolean forAudi = each instanceof Audi && year >= 2015 && year <= 2019;
            boolean forTesla = each instanceof Tesla && year >= 2015 && year <= 2016;
            if (forHonda || forAudi || forTesla) {
                System.out.println(each);
            }
*/
        //Solution 1
        for (Car each : cars) {
            if (each instanceof Honda) {
                if (each.getYear() >= 2010 && each.getYear() <= 2011) {
                    System.out.println(each);
                }
            }
            if (each instanceof Audi) {
                if (each.getYear() >= 2015 && each.getYear() <= 2019) {
                    System.out.println(each);
                }
            }
            if (each instanceof Tesla) {
                if (each.getYear() >= 2015 && each.getYear() <= 2016) {
                    System.out.println(each);
                }
            }


            //1.3. Display the car with the highest price.

            Car highestPriceCar = cars[0];
            Car lowestPriceCar = cars[0];

            for (Car each1 : cars) {
                if (each.getPrice() > highestPriceCar.getPrice()) { // her bir price ,0.indeksteki price dan büyükse, büyük olani sec ve current price büyügü bulana kadar kiyasla
                    highestPriceCar = each1;
                } else if (each1.getPrice() < lowestPriceCar.getPrice()) {
                    lowestPriceCar = each1;
                }
            }
            System.out.println("lowestPriceCar = " + lowestPriceCar);
            System.out.println("highestPriceCar = " + highestPriceCar);
            System.out.println("--------------------------------------------------------");

            //1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.
            ArrayList<Tesla> teslaCars = new ArrayList<>();
            for(Car eachCar : cars){
                if( eachCar instanceof Tesla){
                    teslaCars.add((Tesla) eachCar);//eachCar referansı Car tipindedir ve bu referans Tesla tipine dönüştürülmektedir.
                                                  // Bu nedenle, burada downcasting yapılmaktadır.
                }
            }
        }
    }
}




        /*
         Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016

         1.3. Display the car with the highest price.

         */


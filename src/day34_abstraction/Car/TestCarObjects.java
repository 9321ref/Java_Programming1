package day34_abstraction.Car;

public class TestCarObjects {

    public static void main(String[] args) {

        //  Car car1 = new Car("X6", "Red", 2020, 45000); compile error
        Honda honda = new Honda("Pilot","Black",2019,35000);
        Audi audi = new Audi("Q6","Black",2023,50000);
        Tesla tesla = new Tesla("Model Y", "Blue",2020,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("_------------------------------------------------------------------_");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("--------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("-----------------------------------------------------");

        audi.autoPark();
        tesla.autoPilot();

    }
}

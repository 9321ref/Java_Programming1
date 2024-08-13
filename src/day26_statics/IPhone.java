package day26_statics;

public class IPhone {

    public static String brand = "Apple"; // static variable: "Apple" is the brand of all the iphone objects
    public String model; // instance variable : different models for iphone objects
    public String color; // instance
    public double price;
    public static String OS = "iOS"; // static variable: operating system is same for all the iphone objects
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

/*
    public static void printPhoneInfo(){  // static method only accepts statics
         System.out.println("Model: " + model); --> compile error
         System.out.println("Color: " + color );
    }
 */

    public void printPhoneInfo(){  // --> instance method. void değer döndürmek(return) yerine işlemler gerçekleştirmektir.
        System.out.println("brand = " + brand);  // instance methods accepts both static and none static."actually brand is static"
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("madeIn = " + madeIn);
        System.out.println("hasBattery = " + hasBattery);

    }

    public static void printOperatingSystem(){
        System.out.println("Operating System = " + OS);
    }

    public static void madeIn(){
        System.out.println("IPhone madeIn = " + madeIn);
    }


    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

/*
Attributes:
   brand, model,color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */
package day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

    //        object name
        IPhone iPhone = new IPhone("iPhone12","Black",1000);

    // instance should be call through object "iPhone"
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println("------------------------------------");

    /*
    Do not call the static through Object:Static should be call with class Name "IPhone"
        System.out.println( iPhone.brand);
        System.out.println( iPhone.OS);

        iPhone.printOperatingSystem();

     */

        // static call with Class name "IPhone"
        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();



    }
}


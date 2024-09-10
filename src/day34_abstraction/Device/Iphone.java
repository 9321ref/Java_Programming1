package day34_abstraction.Device;

public class Iphone extends Phone implements Downloadable,AppleApps{

    public Iphone(String model, double price, String color) {
        super("Iphone", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + APP_STORE_NAME);
    }
}


/*
Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */
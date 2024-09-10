package day34_abstraction.Device;

public class Samsung extends Phone implements Downloadable,AndroidApps{

    public Samsung( String model, double price, String color) {
        super("Samsung", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + APP_STORE_NAME);
    }
}

/*
- 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */
package day34_abstraction.Device;

public class Google extends Phone implements Downloadable,AndroidApps {

    public Google( String model, double price, String color) {
        super("Google", model, price, color);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+ APP_STORE_NAME);
    }
}
/*
- 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */
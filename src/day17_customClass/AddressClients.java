package day17_customClass;

public class AddressClients {
    public static void main(String[] args) {


        Address homeAddress = new Address();

       homeAddress.buildingNumber = 28;
       homeAddress.street = "Maichinger street";
       homeAddress.city = "Magstadt";
       homeAddress.state = "BW";
       homeAddress.zipCode = "71106";

        System.out.println(homeAddress); /*  28 Maichinger street
                                              Magstadt BW, 71106
                                         */
        Address officeAddress = new Address();

        officeAddress.buildingNumber = 32;
        officeAddress.street = "Opener street";
        officeAddress.city = "Stuttgart";
        officeAddress.state = "BW";
        officeAddress.zipCode = "70123";

        System.out.println(officeAddress); /*
                                              32 Opener street
                                              Stuttgart BW, 70123
                                          */


    }
}

package day282930_Tasks.PhoneTask;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("XR","Medium","White",1200.9);
        Samsung samsung = new Samsung("S22","Small","Black",2500.7);
        Nokia nokia = new Nokia("Nokia21","Large","Silver",1900.0);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println(samsung.getColor());
        samsung.setColor("PINK"); // WRITE

        iPhone.faceTime(1374758593);
        nokia.call(266372736);
        nokia.text(727378372);
        samsung.developMode();

    }
}

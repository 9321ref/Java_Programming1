package day37_exceptions;

import day34_abstraction.Car_task.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");
        Car car = null;

        car.drive();

        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }
        System.out.println("Program1 ended");
    }
}
/*
Parent exception clause cannot be placed before child exception clause;

Java'da try-catch bloklarıyla çalışırken, daha genel bir istisna sınıfını (parent exception)
daha spesifik bir istisna sınıfından (child exception) önce yakalamaya çalışırsanız,bu bir derleme hatasına neden olur.
Bunun nedeni,Java'da istisnalar daha genel sınıflardan daha spesifik sınıflara doğru yakalanmalıdır.

1)
try {
    // Kod bloğu
} catch (Exception e) {  ***  genel sinif
    // Genel istisna sınıfı
} catch (NullPointerException e) {
    // Daha spesifik istisna sınıfı
}

Yukarıdaki kod derleme hatası verecektir çünkü Exception, NullPointerException gibi daha spesifik istisna sınıflarının üst sınıfıdır (parent class).
Bu durumda, Exception tüm istisnaları yakalayacağı için, alttaki catch bloğuna hiç ulaşılmaz, bu da kodun anlamsız hale gelmesine neden olur.

===========================================================
Dogru sekli;
2)
try {
    // Kod bloğu
} catch (NullPointerException e) { **** spesifik sinif
    // Daha spesifik istisna sınıfı
} catch (Exception e) {
    // Genel istisna sınıfı
}

Bu şekilde, önce daha spesifik istisna yakalanır, ardından daha genel istisnalar yakalanır. Bu, Java'nın istisna yönetiminde önemli bir kuraldır
 */
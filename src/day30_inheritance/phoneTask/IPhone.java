package day30_inheritance.phoneTask;

public class IPhone extends Phone{ //IPhone Is A Phone

    public static boolean hasApplePay = true;

    public IPhone(String model,String size, String color,double price){  // eger constructor parent classtan child classta inheritance yapmak istyorsak direk aktaramayiz.this() yerine super keyword kullanilmali
        super("Apple",model,size,color,price); //brand eklemedik, cünkü her argument apple olmasi icin.gerekli deil.String brand yazsaydik her marka olusturabilirdk
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() +" is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() +" is face timing with " + email);
    }
}

/*
2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

 */
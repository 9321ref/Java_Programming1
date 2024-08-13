package day30_inheritance.phoneTask;

public class Nokia extends Phone{


    public Nokia(String model,String size,String color,double price){
        super("Samsung",model,size,color,price);
        // subsclass samsung old icin bi daha String brand yazmiyoruz.
    }

    public void selfDefense(){
        System.out.println(getBrand() +" "+ getModel()+" can be used for self defense");
    }
}

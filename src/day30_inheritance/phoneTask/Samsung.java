package day30_inheritance.phoneTask;

public class Samsung extends Phone {

    // Parents class icinden child class interitance yapilmasi lazim .ana sinifta ki fields subsclass cagirmak icin constructor olusturmali
    // constructor direk subsclass oluturayz super keyword ile baska classa miras birakilir.cünkü parent classtaki constructors class adyla
   // subsclassta kullanamyiz

    public Samsung(String model,String size,String color,double price){
        super("Samsung",model,size,color,price);
        // subsclass samsung old icin bi daha String brand yazmiyoruz.
    }

    public void freeze(){
        System.out.println(getModel() +" "+ getModel() +" freezes a lot");
    }


}

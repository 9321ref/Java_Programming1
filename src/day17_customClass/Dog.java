package day17_customClass;

public class Dog {  // dog is object

    //--------------CUSTOM CLASS--------


    public String name;  // Instance variable   // bir tane variable olusturduk bi cok farkli ismi depolayabiliriz.
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name,String breed, char gender,int age, String size, String color){ //  Local variable // yukardaki 6 parametreyi kaydedip her bir object direk basliklari atiyor
       this.name = name; // -this- keyword is used for calling the instance variable name
       this.breed = breed;
       this.gender= gender;
       this.age = age;
       this.size = size;
       this.color = color;
    }// this method can help us to set all the information of the dog at once



    public void eat() {     // static olursa name declare olmuyor.Anlami  "only one" demek  yani tüm object ayni demek.ama farkli Object ve
                            // her biri diffrent attributes and actions
                            // all objects have own copies that's why we declared them as instance variable.ayri ayri copy olacak
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name +" is drinking water");
    }


    public String toString() { // to avoid getting hash-codes
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

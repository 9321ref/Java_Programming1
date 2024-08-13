package day29_inheritance.animalTask;

public class Cat extends Animal{

    public void meow(){  // Cat Is An Animal
        System.out.println(getName() +" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }




}
// Animal class icinde olan method ve variables Cat class miras olarak alir.
// Cat sinifina özel bir özelligi Cat classinda kendimiz instance methodla yazabilriz.
// Kedinin meow demesi ona hastir

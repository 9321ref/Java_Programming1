package day34_abstraction;

import day34_abstraction.AnimalInterface.Playable;
import day34_abstraction.AnimalInterface.Swimmable;

public class Person implements Playable, Swimmable {


    @Override
    public void play() {
        System.out.println();
    }

    @Override
    public void swimmable() {
        System.out.println();
    }
}

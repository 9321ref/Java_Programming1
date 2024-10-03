package day34_abstraction.Car_task;

public interface AutoPark {

    //public static final booleandan önce yazabilriz ama gri olur gereksiz implicitly yzilir
    boolean hasAutoPark = true;  //this variable static & final by default.

    //Abstract method
    void autoPark(); // abstract is given by default


}
/*
Create an Interface Named 'AutoPark':
    - Variable:
        - hasAutoPark
    - Abstract Method:
        - autoPark()
 */
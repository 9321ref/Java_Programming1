package day32_finalKeyword;

import java.time.LocalDate;

class Student{ // class name cannot be the final keyword.that is mean there is no child for parent.it cannot be inheritance with the final keyword

    public final void language(){
        System.out.println("Java Programming");
    }


}



public final class FinalKeywordIntro extends Student { // final geldigi icin yukardaki Parent class olmaz

/* // final methods can never be overridden -> Student Parent class
    public void language(){
        System.out.println("Python Programming");
    }
 */

    public FinalKeywordIntro() {

    }


    public static void main(String[] args) {

        final char gender ='M'; // the final keyword it prevents from being reassigned .only one time can assign

        System.out.println(gender);//M

       // gender = 'F'; //the final keyword it prevents from being reassigned .only one time can assign

        System.out.println(gender);//F

        System.out.println("_-------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

       // dateOfBirth = dateOfBirth.plusYears(1); variables become unchangeable

        System.out.println(dateOfBirth);

        System.out.println("----------------------------------------------------");

        new Student().language();//Java Programming
        new FinalKeywordIntro().language();//Python Programming

    }
}

package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class A6_TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };

        people[0].setInfo("Refianur",'F', LocalDate.of(2000,2,16));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people)); // addAll is Collections type ,Collections type don't accep array directly. people is array,Arrays.aslist yaparak people arraylist cevrdik
                                                   // people data type dikkat primitive degilse aslist methodyla convert yapabiliyorz


        /*

        // print name & date of birth of each person object


        // remove all the person object that has the age > 55

         */




    }
}

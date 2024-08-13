package day24_dateAndTime;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class A7_RemoveIfMethodPractice {

    public static void main(String[] args) {
                                                                                          //Array list disinda declare ve assign yaptik.
        Dog[] dogs= {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()}; // Array list icinde ypsaydik get() methodunu kullancaktik tek tek
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        //1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dog2array to smalldog2arrayList
        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs)); // Array can convert to the collection type wíth Arrays.aslist() method
        smallDogs.removeIf( p -> !p.size.equalsIgnoreCase("small")); // small olmayanlari removeif methodyla cikar.small yazdr
                         //Dog
        /*
        for( Dog each : dogs){
            if(each.size.equalsIgnoreCase("small")){
                smallDogs.add(each);
            }
        }
         */

        System.out.println("smallDogs = " + smallDogs);
        System.out.println("1  ---------------------------------------------------------------");

    // 1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dog2array to youngdog2arrayList
        ArrayList<Dog> youngDog = new ArrayList<>(Arrays.asList(dogs));

          /*
        for (Dog dog : dogs) {
            if(dog.age <= 4){
                youngDogs.add(dog);
            }
        }

         */

        youngDog.removeIf( p -> p.age > 4);

        System.out.println("youngDog = " + youngDog);

    //1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dog2array to femaledog2arrayList
        ArrayList<Dog> femaleDogs= new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf( p -> p.gender == 'M');

        ArrayList<Dog> maleDogs= new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf( p -> p.gender == 'F');

        System.out.println("2  ----------------------------------------------------------------");

        Dog[] dogs2= {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf( p -> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[list.size()]); // Arraylist convert to the array day 23

        System.out.println(Arrays.toString(dogs2)); // Array oldu yeni listimiz bu yüzden Arrays.toString yazdiriyorz





    }
}


/*
warmup tasks:
	1. Give the following array of dogs
            Dog[] dog2= {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dog2array to smalldog2arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dog2array to youngdog2arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dog2array to femaledog2arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dog2array to maledog2arrayList

	            Note: DO NOT use any loops





 */

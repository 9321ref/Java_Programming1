package day192021_Tasks;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        //Print the following output: (add \t between two words)
        for (String[] eachRow : items) { // ürünlerin ,her bir arrayi(satiri)
            for (String eachItem : eachRow) { // her bir satirin ,her bir ürünü
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }
        System.out.println("1 --------------------------------------------------------");

        //3 Print the following output: (add \t between two words) reverse

        for (String[] eachRow : items) { // ürünlerin her bir satirini reverse et asagida
            for (int i = eachRow.length - 1; i >= 0; i--) { // reverse et . i: burada bir item index numarasi
                System.out.print((eachRow[i]) +"\t");
            }
            System.out.println();
        }
        // Print the following output: (add \t between two words)
        System.out.println("2------------------------------------------------------------");

            for (int i = items.length - 1; i >= 0; i--) {
                for (String eachRow : items[i]) {
                    System.out.print(eachRow+ "\t");
                }
                System.out.println();
            }

        }



    }


 /*
  Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

             10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado
  */
package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class A2_RemoveElementsCollectionTask {

    public static void main(String[] args) {

        //. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) { // remove method remove the element by index ,then for iterating use for loop to get index number
            if (list.get(i) < 4) { // i --> index number of iteration of each element
                list.remove(i); // i indeksinde olan sayi 4 ten kücük kosulunu sagliyorsa remove methodyla cikariyoruz.remove methodu indeks numarasyla olur (i)

            }
        }
        System.out.println(list);


        System.out.println("------------------------------------------------------------------------");

        //Write a program that can remove the elements that are less than 4, from an ArrayList of integer

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list1.removeIf(p -> p < 4 ); // p ilk iteration num. (p<4) kosulu yazdik.

        System.out.println(list1); //[4, 5, 6, 7, 4, 5, 6, 7]


        System.out.println("--------------------------------------------------------------------");

        // Write a program that can remove the elements that starts with "J", from an ArrayList of integer

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java","Python","C#","Java","Ruby","C++","C"));

        names.removeIf(p -> p.startsWith("J")  ); // p : variable name.  each element of Arraylist doing iteration

        System.out.println(names); //[Python, C#, Ruby, C++, C]



        System.out.println("=============================================================");



        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        employees.removeIf( p -> p.salary > 100000 );

        for (Employee each : employees) {// p -> referring employee object
            System.out.println(each.name + " : "+each.salary);
        }
    }
}

//          COK ÖNEMLI
// when you use to iteration collection and try to remove element, it will not remove, probably.do not use remove in the loop
// that's why we must use iterable method doing iteration collection. you should use removeif method
//
/*

    2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */
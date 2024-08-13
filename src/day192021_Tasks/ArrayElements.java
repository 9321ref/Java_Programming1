package day192021_Tasks;

public class ArrayElements {
    public static void main(String[] args) {

    //.1 Create an array of integers with a length of 100
        int arr[] = new int [100];

    //2 Assign values from 1 to 100 to the indexes of the array.

        for (int i = 1; i <= 100 ; i++) { // 1 'den baslayip 1 kücüktü 100 den dogru o zaman i 1 artir ,
            arr[i-1] = i;// 2-1 = i =1 , console 1 yaz

        }

    //3 Display the array elements in a single line separated by spaces.
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

        System.out.println();

    //4 Display the array elements in a single line in reversed order, separated by spaces.
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();

    //5 Display all evenly divisible elements by 5 in a single line separated by spaces.

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0){
                System.out.print(arr[i]+ " ");
            }

        }







    }

}
/*
. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

 */
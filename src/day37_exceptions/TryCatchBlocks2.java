package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};


        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); //display full details of the exception after the execution of program .handle etmeden önceki problemin analizini yazar
                                 // ve her sekilde kodu handle edip console yazdirir. console da kirmizi exception gsterir ama 0 problemle bittiginide gsterir
                                // catch icinde yazilir bu method
           // System.out.println(e.getMessage()); //->Index 1000 out of bounds for length 4 .problemin sadce nedenini veryor
        }
        System.out.println("Program1 ended");


        System.out.println("-------------------------------------------------------");

        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
           // System.out.println(e.getMessage()); ->' / by zero' kodun icinde ki problemin mesajini veriyr sadece exception method message

        }

        System.out.println("Program1 ended");

        System.out.println("-----------------------------------------------------------");


        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 ended");



    }

}
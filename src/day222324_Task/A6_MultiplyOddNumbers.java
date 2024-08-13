package day222324_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class A6_MultiplyOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> multiplyOdd = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0 ; i < multiplyOdd.size(); i++){
            int eachNum = multiplyOdd.get(i); // declare ve assign yaptik her bir rakami edinmek icin eachNum atadik
           if(eachNum % 2 == 1){ // her bir rakam 2'ye bölününce 1 kalani olursa
               multiplyOdd.set(i,eachNum * 2); // 2 ye carparak update et multiplyOdd listesini
           }
        }
        System.out.println(multiplyOdd);

    }
}

// second way
/*
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i <list.size() ; i++) {

            if(list.get(i)%2!=0) {

                list.set(i,list.get(i)*2);
            }
        }
        System.out.println(list);

    }
 */



/*
6. Create a class called MultiplyOddNumbers and write a program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]


 */
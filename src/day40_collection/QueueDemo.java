package day40_collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();// order is random,does not accept null,does not have index
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
       // queue1.addAll(Arrays.asList(null,null,null));//NullPointerException

        System.out.println(queue1);// output [10, 10, 10, 40, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200, 90]

        int num1 = queue1.poll(); //--> FIFO First-in, First out order element eksilir
        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);

        //System.out.println(queue1.get(4)); does not have index num. yo can not allow to use get() method

         System.out.println("------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order, does not accept null
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
      //  queue2.addAll(Arrays.asList(null,null,null));//NullPointerException

        System.out.println(queue2);//output:[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();
        System.out.println(queue2);// output: [200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        System.out.println(queue2); //output [] -> nothing

       // System.out.println(queue2.get(4)); does not have index num. yo can not allow to use get() method

        System.out.println("-------------------------------------------------------");


        Queue<Integer> queue3 = new LinkedList<>();//insertion order,accept null,has index num
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null));

        System.out.println(queue3);//output [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        queue3.poll();
        System.out.println(queue3);//[200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null] ilk element eksildi

        System.out.println(( (LinkedList)queue3).get(4) );//output: 10 .direk get method kullanamayiz.down casting yapmaliyiz.reference type get methodu yok


        System.out.println("----------------------------------------------");

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list.get(1)); // 200

        System.out.println(list); //[10, 200, 300, 40, 90]

        ((LinkedList)list).poll(); // poll method reference type yok bu yüzden down casting ypariz

        System.out.println(list);//[200, 300, 40, 90]

        ( (Stack)list ).pop(); //LIFO Linked-list does not have relation with Stack

        System.out.println(list);



    }
}

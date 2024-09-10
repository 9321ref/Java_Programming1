package day40_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
/*
        for(Integer each : list){
            if(each < 5){
                list.remove(each);
            }
        }

        System.out.println(list);//ConcurrentModificationException
 */

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 5){
                list.remove(i);
            }
        }
        System.out.println(list); //output [2, 4, 5, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7].buradaki iteration da 5 den kücükler var. cünkü sürekli index numara degisiyor ilk rakami cikardiktan snra.
                                                   //ve collection regular veya each loop ile remove yapilamaz index degistigi icin.iterable kullanilmali collection icin
                                                  //remove loop icinde kullanmiyoruz .index kaymasina neden oluyor.iterator kullanmamiz gerekiyor


        System.out.println("--------------------safety remove by using iterator with while loop--------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

      Iterator<Integer> it = list2.iterator();

      while (it.hasNext()){
          Integer each = it.next();
          if(each < 5){
              it.remove();
          }
      }
        System.out.println(list2);//[5, 5, 6, 7, 5, 6, 7]

        System.out.println("---------------------safety remove using iterator with for loop-------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for(Iterator<Integer> i = list3.iterator(); i.hasNext();){ // i++ gerek yok hasNext element kalmaynca loop duracak
               Integer each = i.next();

               if(each < 5){
                   i.remove();
               }
        }
        System.out.println(list3);


        System.out.println("------------------shorter way removeIf--------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf( each -> each < 5);

        System.out.println(list4);//output [5, 5, 6, 7, 5, 6, 7]

        System.out.println("--------------------------------------------------------------------------");


        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf(p -> p < 5);

        System.out.println(list5);
    }
}
/*
hasNext() ve next() metodları genellikle bir döngü (loop) ile birlikte kullanılır.

hasNext() metodu ile koleksiyonda bir sonraki elemanın olup olmadığını kontrol edersiniz.
Eğer bir sonraki eleman varsa, next() metodu ile o elemanı alırsınız.

next() Metodu;

Ne Yapar?: next() metodu, koleksiyondaki bir sonraki elemanı döner ve işaretçiyi (pointer) bir sonraki konuma taşır.
Eğer koleksiyonun sonuna gelinmişse ve next() çağrılırsa, NoSuchElementException hatası fırlatılır.

Ne İçin Kullanılır?: Bu metod, koleksiyondan elemanları sırasıyla almak için kullanılır.
Döngü sırasında her çağrıldığında, bir sonraki eleman döndürülür.
 */
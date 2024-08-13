package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class A3_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = "";   // a3b4cw5

        for(String each : str.split("")){ // Stringi Array e ayiriyor, split yaparak ["a","a","a"....]
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);// frequency method from utility Collection class,Array is not collection,//split methodu Arrayin metodu.
                                                                                            // Spliti array liste dönüstürerk.Collection class ta kullanbilcez
            if(!result.contains(each)){                                                     //Arrays.asList(str.split("")) ifadesiyle önce str dizesi parçalara ayrılır
                result += each +frequency ;                                                 // each karekterinin  kec kez frequency oldgu hesaplayip frequency int atar (1:51 min video)
            }                                                                                // split is String Object yani non-Primitive.String array will be converted to the Collection with Arrays.asList

        }
        System.out.println(result); //a3b4c5



    }
}
/*
split metodu genellikle bir dizenin parçalara ayrılması gerektiğinde kullanılır.
Collections.frequency metodu bir koleksiyon içinde belirli bir öğenin kaç kez geçtiğini sayar.
Yukarıdaki kod parçasında, her bir karakterin kaç kez geçtiği ve bu frekansların result dizesine nasıl eklendiği gösterilmiştir.
 */
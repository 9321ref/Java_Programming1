package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements_2 {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Ayse");//0
        names.add("Ayse");//1
        names.add("Enes");
        names.add("Enes");
        names.add("Ali");
        names.add("Ahmet");// 5
        names.add("Taha");
        names.add("Ali");
        names.add("Ahmet");
        names.add("Hasan");

        for(String each : names){ // names icinde her bir kelimeyi yazdir
            if(names.indexOf(each) == names.lastIndexOf(each)){ //indexOf ayni olan kelimenn ilk olanin indeksini buluyor.
                                                          // lastIndexOf ayni olan kelimennn iknci yazilmis kez yailmis indeksini buluyor
                System.out.println(each); // taha
              //  break; break olamzsa islem devam edip ikinci unique elementi bulur
            }
        }
    }
}

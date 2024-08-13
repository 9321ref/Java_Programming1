package day16_nestedLoop;

public class FrequencyOfWordWhileLoopInterview {

    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        //case sensitivity
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        while(sentence.contains(word)){ // cümlede var olup olmadigini kontrol eder
            count++;                    // -> bulundugu her sefernde sayaci artirir

         sentence = sentence.replaceFirst(word,"");
             /*
             bu methodu cümlede degistrme yaparak, java kelimesni sayisni bulmak.
             Döngü her sefernde sadece bir kelmeyi deistirdigi icin,cümlede cümlede
             kac kez gectigi  dogru bir sekilde sayilir. replaceFirst ile her sefernde sadece ilk bulunan
             kelime degistirilir ve döngü bu islemi cümlede ki tüm gecisleri sayana kadr tekrar eder

        "Java Java Java Java"; //count = 0;  // java grdügün kelimenn yerin "" -> yani bosluk koy
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4

              */

        }
        System.out.println(count);

    }

}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

 */
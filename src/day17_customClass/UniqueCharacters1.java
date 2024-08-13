package day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabccd";

        String unique = "";

        for (int i = 0; i < str.length() ; i++) { // i: index numbers of str
            char each = str.charAt(i); // str de olan tüm her bir char ulasmak icin .eger loop execute ise asagi inip her bir karekeri tarar

            if(str.indexOf(each) == str.lastIndexOf(each) ){    //a harfinin index numarasyla lastindexOf esitse dogru kabul edip harfi essiz kabul edyor
                unique += each;                                              // yani bir tane karekter dye kabul edip String unique ekliyor.
                                                                // 'a' nin index numarasi 0 last index numarasi 1 esit deil .o zamn bu unique degil


            }

        }
        System.out.println(unique);

    }

}

// loop bna unique karekteri bulmama yardim eder.ama biz burada bu methodu kullanmadik .unique2 de loop ile cözdük

/*
Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */
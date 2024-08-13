package day17_customClass;

public class UniqueCharacter2 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length(); j++) { //strring str nin her bir karekterini sirayla ele alir.str uzuluguna kadr

                                         // 1)checks how many times the ch has appeared in str
            char ch = str.charAt(j);  // 2)unique olup olmadigini bulmak icin tüm karekterileri 0 dan tarayacak. buldukca frequency koycak
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {// if the ch has appeared in the String
                    frequency++; // increase the frequency by 1
                }
            }

                // sonra bir sefer yazilmissa unique ekle

                if (frequency == 1) { // if the frequency one, then it's unique
                    unique += ch;
                }

            }

            System.out.println(unique);

        }
    }

/*
Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */
package day222324_Task;

public class A2_UpperCaseAndLowerCase {

    public static void main(String[] args) {
        System.out.println(upperLowerMatch("REFIA refia"));
    }

    public static boolean upperLowerMatch(String str){
        /*
        int upper = 0;
        int lower = 0; I can write also
         */
        int upper = 0, lower = 0;

        for(char each : str.toCharArray()){
            if(Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)){
                lower++;
            }
        }

        return upper == lower;
    }

}

/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Examples:
	            str = "JAVA java";

	        output:
	            true

	            return dedigi icin custom class olustrmamiz lazim
 */
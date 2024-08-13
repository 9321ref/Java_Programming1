package day08_ternary_Switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'B';


        /*
        A:Excellent
        B:Great Job
        C: Good
        D: Passed
        F:Failed
         */   // switch does not accept any boolean expressions " logical or ,and "

        /*
        String result = "";


        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("----------------------------------");
/*

         */

        switch (grade){

            case 'A':
                System.out.println("Excellent");  // when no "break" it will continue block ,all statement execute on the console
                break;                            // break koymadiginda daha sonra ki statement execute oluyor.ama sonda break olamasada olur

            case 'B':
                System.out.println("Great Job");
                break;

            case'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Invalid"); // if there is no requested value // at the end of does not need "break"


        }









    }
}







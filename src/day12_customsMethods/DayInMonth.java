package day12_customsMethods;

public class DayInMonth {

    public static void main(String[] args) {

        dayInMonth("may");

    }


    public static void dayInMonth(String month) {


        month =month.substring(0,1).toUpperCase() +month.substring(1).toLowerCase();

        // String result = month + " has " ;
/*
        switch(month) {
            case "February":
                result += 28 + " days";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                result += 30 + " days";
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result += 31 +  " days";
                break;
            default:
                result = "invalid month";


        }
        System.out.println(result);
*/

/*        switch ( month ){
            case "January","March","May","July","August", "October", "December" -> System.out.println(month +" has 31 days");
            case "February" -> System.out.println(month + " has 28 days");// no break needed
            case "April","June","September","November" -> System.out.println(month +  " has 30 days");// no break needed
            default -> System.out.println("Invalid number");
 */

        switch(month) {
            case "January", "March", "May", "July", "August", "October", "December":
                System.out.println(month + " has 31 days");
                break;

            case "February":
                System.out.println(month + " has 28 days");
                break;

            case "April", "June", "September", "November":
                System.out.println(month + " has 30 days");
                break;

            default:
                System.out.println("Invalid Number");
        }

    }
}
/*
. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */


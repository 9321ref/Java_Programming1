package day14_forLoopAndOverLoading;

public class DayAndMonth {

        public static void main(String[] args) {

            System.out.println(dayOfName(4));
            System.out.println(monthName(6));

            daysInMonth(5);

        }

        public static String dayOfName(int n) {

            return switch (n) {

                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid Number";


            };

        }


        public static String monthName(int n) {

            String result;
            if (n == 1) {
                result = "January";
            } else if (n == 2) {
                result = "February";
            } else if (n == 3) {
                result = "March";
            } else if (n == 4) {
                result = "April";
            } else if (n == 5) {
                result = "May";
            } else if (n == 6) {
                result = "June";
            } else if (n == 7) {
                result = "July";
            } else if (n == 8) {
                result = "August";
            } else if (n == 9) {
                result = "September";
            } else if (n == 10) {
                result = "October";
            } else if (n == 11) {
                result = "November";
            } else if (n == 12) {
                result = "December";
            } else {
                result = "Invalid Number";
            }
            return result;
        }


        public static void daysInMonth(int n) {


            int days = 0;
            switch (n) {
                case 2:
                    days = 28;
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    break;
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                default:
                    return;
            }

            System.out.println(monthName(5) + " has " + days + " days");
        }


    }


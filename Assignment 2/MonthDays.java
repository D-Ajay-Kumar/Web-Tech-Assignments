import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        int month, days;
        String monthName;
        Scanner scanner = new Scanner(System.in);

        // take month number as input
        month = scanner.nextInt();

        // close scanner to avoid memory leaks
        scanner.close();

        // check corresponding month name and days
        switch(month){
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                monthName = "Invalid input";
                days = 0;
                break;
        }

        System.out.println("Month: " + monthName);
        System.out.println("Days: " + days);
    }
}

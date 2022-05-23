package homework_Lesson_4;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {
        //Write a program to print the days of the week based on the user 1-7 digit input.
        //The message should be “The [user input digit]-st/nd/rd/th day of the week is [the day of the week]”
        // Hint: Use switch-case.

        int weekdayNumber;
        String dayOfWeek = null;
        String daySuffix = "th";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit number, between 1 and 7: ");
        weekdayNumber = scanner.nextInt();

        switch (weekdayNumber) {
            case 1:
                daySuffix = "st";
                dayOfWeek = "Monday";
                break;

            case 2:
                daySuffix = "nd";
                dayOfWeek = "Tuesday";
                break;

            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;

            case 4:
                dayOfWeek = "Thursday";
                break;

            case 5:
                dayOfWeek = "Friday";
                break;

            case 6:
                dayOfWeek = "Saturday";
                break;

            case 7:
                dayOfWeek = "Sunday";
                break;

            default:
                System.out.println("This is not a valid day of the week.");
        }

        if (weekdayNumber >= 1 && weekdayNumber < 8)
        System.out.format("The %d-%s day of the week is %s", weekdayNumber,daySuffix, dayOfWeek);

    }
}

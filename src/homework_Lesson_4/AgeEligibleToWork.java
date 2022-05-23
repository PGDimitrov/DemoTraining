package homework_Lesson_4;

import java.util.Scanner;

public class AgeEligibleToWork {

    public static void main(String[] args) {

        int userAge;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        userAge = scanner.nextInt();

        if (userAge >= 16) {
            System.out.println("You are eligible to work.");
        }

        else {
            System.out.println("You are not eligible to work.");
        }
    }
}

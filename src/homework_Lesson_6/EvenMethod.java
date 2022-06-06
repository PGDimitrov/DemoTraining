package homework_Lesson_6;

import java.util.Scanner;

public class EvenMethod {

    public static void main(String[] args) {

//Write a method named isEven that accepts an int argument.
//The method should return true if the argument is even or false otherwise.

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        number = scanner.nextInt();

        if (isEven(number)) {
        System.out.println("The integer is even: True");
        } else {
            System.out.println("The integer is even: False");
        }

    }

    public static boolean isEven (int number) {
        if (number %2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

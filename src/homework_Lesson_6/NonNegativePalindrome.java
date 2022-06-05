package homework_Lesson_6;

import java.util.Scanner;

public class NonNegativePalindrome {

    public static void main(String[] args) {


        //A takes as input a non-negative integer and returns true if the number is a palindrome or false otherwise.
        //Non-negative integer is called a palindrome if it reads forward and backward in the same way.
        //For example, the numbers 5, 121, 3443, and 123454321 are palindromes.

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        number = scanner.nextInt();


        if (isPalindrome(number)) {
            System.out.println("The integer is palindrome: True");
        } else {
            System.out.println("The integer is palindrome: False");
        }

    }
    public static boolean isPalindrome (int num) {


        int i = num;
        int remainder;
        int reversedNumber = 0;

        if (i < 0){
            System.out.println("Please enter a non-negative integer!");

        }

        while (i > 0 ) {
            remainder = i % 10;
            i = i / 10;
            reversedNumber = reversedNumber * 10 + remainder;

        }
            return reversedNumber == num;

    }

}

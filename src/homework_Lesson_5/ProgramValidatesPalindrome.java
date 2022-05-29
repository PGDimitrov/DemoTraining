package homework_Lesson_5;

import java.util.Scanner;

public class ProgramValidatesPalindrome {

    public static void main(String[] args) {

        //Write a program which validates whether a given string is palindrome
        //(a palindrome is a sequence of characters which reads the same backward or forward, such as madam or racecar)

        String word = "";
        String revert = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string you want to check: ");
        word = scanner.next();

        word = word.toLowerCase();
        int n = word.length();

        for (int i = n-1; i >= 0 ; i--) {
            revert = revert + word.charAt(i);
        }

        if (word.equals(revert)) {
            System.out.println("The string you entered: " +word+ " is a palindrome.");
        }
        else {
            System.out.println("The string you entered: " +word+ " is not a palindrome.");
        }

    }
}

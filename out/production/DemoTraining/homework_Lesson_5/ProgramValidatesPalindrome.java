package homework_Lesson_5;

import java.util.Scanner;

public class ProgramValidatesPalindrome {

    public static void main(String[] args) {

        //Write a program which validates whether a given string is palindrome
        //(a palindrome is a sequence of characters which reads the same backward or forward, such as madam or racecar)

        String word;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string you want to check: ");
        word = scanner.next();

        word = word.toLowerCase();


        if (word.charAt(i) != word.charAt(word.length()-i-1)) {
            System.out.println("The string you entered is not a palindrome.");
        }
        else {
            System.out.println("The string you entered is a palindrome.");
        }

    }
}

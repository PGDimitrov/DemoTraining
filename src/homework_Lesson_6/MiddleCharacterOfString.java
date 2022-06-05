package homework_Lesson_6;

import java.util.Scanner;

public class MiddleCharacterOfString {

    public static void main(String[] args) {

        //Write a Java method to display the middle character of a string.
        //a) If the length of the string is even, there will be two middle characters.
        //b) If the length of the string is odd, there will be one middle character.
        //Find the biggest element of an array and print it in the console.

        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = scanner.next();

        System.out.println("The middle character of the string is:" + middleCharacter(str));

    }

    public static String middleCharacter (String str) {

        int position;
        int length;

        if (str.length() % 2 == 0) {
            position = str.length() /2 -1;
            length = 2;
        }
        else {
            position = str.length() /2;
            length = 1;
        }
        return str.substring (position, position + length);

    }


}

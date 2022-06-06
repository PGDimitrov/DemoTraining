package homework_Lesson_6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MethodToCountAllWordsInString {

    public static void main(String[] args) {

        //Write a Java method to count all words in a string.
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = scanner.nextLine();

        System.out.println("The number of the words in the string are:" + countAllWords(str)+"\n");
    }

    public static int countAllWords(String str) {

        if (str == null || str.isEmpty())
            return 0;
        StringTokenizer tokens = new StringTokenizer(str);
        return tokens.countTokens();
    }
}




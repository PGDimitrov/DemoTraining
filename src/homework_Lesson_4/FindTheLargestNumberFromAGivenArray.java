package homework_Lesson_4;

import java.util.Scanner;

public class FindTheLargestNumberFromAGivenArray {

    public static void main(String[] args) {

        //Find the largest number from a given array and print it in a console.
        // Hint: use for loop.

        int[] array = {15, 5, 75, 40};
        int max = 0;

        for (int i = 0; i < array.length; i++ ) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

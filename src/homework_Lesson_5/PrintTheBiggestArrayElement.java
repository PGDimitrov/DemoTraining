package homework_Lesson_5;

import java.util.Arrays;

public class PrintTheBiggestArrayElement {

    public static void main(String[] args) {

        //Find the biggest element of an array and print it in the console.

        int [] array = {10, 70, 30, 60, 50};

        int max = 0;

        System.out.println("The initial array is: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++ ) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The largest number is: " +max);
    }
}

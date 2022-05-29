package homework_Lesson_5;

import java.util.Arrays;

public class PrintSumOfGivenArrayElements {

    public static void main(String[] args) {

        //Write a program to print the sum of given array elements.
        int [] array = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("The initial array is: " + Arrays.toString(array));
        System.out.println("The sum of the array elements is: " + sum);

    }
}

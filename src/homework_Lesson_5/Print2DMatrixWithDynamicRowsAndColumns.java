package homework_Lesson_5;

import java.util.Scanner;

public class Print2DMatrixWithDynamicRowsAndColumns {

    public static void main(String[] args) {

        //Print the elements of a given 2D matrix with dynamic rows and columns taken from user input.

        int rows;
        int columns;
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of the columns: ");
        columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the array: ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }


        System.out.println("The array elements are: ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

    }
}

package homework_Lesson_5;

public class Print2DMatrix_4rows_3columns {

    public static void main(String[] args) {

        //Print the elements of a given 2D matrix with 4 rows and 3 columns.

        int[][] matrix = new int[4][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        matrix[3][0] = 10;
        matrix[3][1] = 11;
        matrix[3][2] = 12;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)

                System.out.print(matrix[i][j] + " ");
            System.out.println();

        }
    }

}

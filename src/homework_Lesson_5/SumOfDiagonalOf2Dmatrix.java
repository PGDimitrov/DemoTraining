package homework_Lesson_5;

public class SumOfDiagonalOf2Dmatrix {

    public static void main(String[] args) {

        //Find the sum of the diagonal of a given 2D matrix with 4 rows and 4 columns.

        int[][] matrix = new int[4][4];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 8;//different on purpose to have a difference in the diagonals sum
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)

                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        int diagonal1 = 0; //equal to the sum of ((0,0)+(1,1)+(2,2)+(3,3)), where elements index are equal i==j
        int diagonal2 = 0; //equal to the sum of ((0,3)+(1,2)+(2,1)+(3,0)), where elements index sum is equal to matrix.length-1

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    diagonal1 += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal 1 sum is:" +diagonal1);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i + j == matrix.length - 1) {
                    diagonal2 += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal 2 sum is:" +diagonal2);

    }
}

// package practice3;


/**
 * TASK 3 
 */
public class ColumnSort {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 3, 7},
            {2, 8, 5},
            {4, 6, 1}
        };

        sortColumns(matrix);

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void sortColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                int current = matrix[i][j];
                int k = i - 1;

                while (k >= 0 && matrix[k][j] > current) {
                    matrix[k + 1][j] = matrix[k][j];
                    k--;
                }
                matrix[k + 1][j] = current;
            }
        }
    }
}

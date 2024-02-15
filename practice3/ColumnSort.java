// package practice3;

import java.util.Arrays;

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

        int[][] rotated = rotateMatrix(matrix);
        int[][] sorted = sorteMatrix(rotated);
        int[][] reverted = revertRotateMatrix(sorted);
        
        for (int[] row : reverted) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static int[][] revertRotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] reverted = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                reverted[n - 1 - j][i] = matrix[i][j];
            }
        }
        return reverted;
    }

    public static int[][] sorteMatrix(int[][] matrix){
        int[][] val = matrix; 
    
        for (int i = 0; i < matrix.length; i++){
            Arrays.sort(val[i]);
        }
        return val;
    }
    
}

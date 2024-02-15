// package lab3;

/*
 * Task 4
 */
public class DiagonalOperations {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 1},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxMainDiagonal = findMaxMainDiagonal(matrix);
        int sumMain = sumMain(matrix);
        int sumReverse = sumReverse(matrix);

        System.out.println("Наибольший элемент по главной диагонали: " + maxMainDiagonal);
        System.out.println("Сумма элементов по главной диагонали: " + sumMain);
        System.out.println("Сумма элементов по обратной диагонали: " + sumReverse);
    }

    public static int findMaxMainDiagonal(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            max = Math.max(max, matrix[i][i]);
        }
        return max;
    }

    public static int sumMain(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; 
        }
        return sum;
    }

    public static int sumReverse(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i]; 
        }
        return sum;
    }
}

package lab3;

public class DiagonalOperations {
    public static void main(String[] args) {
        // Пример двумерного массива
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Вызов методов для нахождения наибольшего элемента по главной диагонали
        // и суммы элементов по главной и обратной диагонали
        int maxMainDiagonal = findMaxMainDiagonal(matrix);
        int sumMainAndReverseDiagonals = sumMainAndReverseDiagonals(matrix);

        // Вывод результатов
        System.out.println("Наибольший элемент по главной диагонали: " + maxMainDiagonal);
        System.out.println("Сумма элементов по главной и обратной диагонали: " + sumMainAndReverseDiagonals);
    }

    // Метод для нахождения наибольшего элемента по главной диагонали
    public static int findMaxMainDiagonal(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            max = Math.max(max, matrix[i][i]);
        }
        return max;
    }

    // Метод для нахождения суммы элементов по главной и обратной диагонали
    public static int sumMainAndReverseDiagonals(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Главная диагональ
            sum += matrix[i][n - 1 - i]; // Обратная диагональ
        }
        // Если размерность массива нечетная, то центральный элемент будет учтен дважды,
        // поэтому вычитаем его один раз
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }
}

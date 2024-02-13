package practice3;

public class ColumnSort {
    public static void main(String[] args) {
        // Пример двумерного массива
        int[][] matrix = {
            {9, 3, 7},
            {2, 8, 5},
            {4, 6, 1}
        };

        // Вызов метода для сортировки по столбцам
        sortColumns(matrix);

        // Вывод отсортированной матрицы
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Метод для сортировки элементов по столбцам
    public static void sortColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Проход по каждому столбцу
        for (int j = 0; j < cols; j++) {
            // Сортировка столбца
            for (int i = 1; i < rows; i++) {
                int current = matrix[i][j];
                int k = i - 1;
                // Вставка текущего элемента в правильное место
                while (k >= 0 && matrix[k][j] > current) {
                    matrix[k + 1][j] = matrix[k][j];
                    k--;
                }
                matrix[k + 1][j] = current;
            }
        }
    }
}
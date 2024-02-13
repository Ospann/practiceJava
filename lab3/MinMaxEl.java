package lab3;

public class MinMaxEl {
    public static void main(String[] args) {
        // Пример массива
        int[] array = {5, 10, -3, 8, 15, 20, -7};

        // Вызов метода для поиска минимального и максимального элементов
        int[] minMax = findMinMax(array);

        // Вывод результатов
        System.out.println("Минимальный элемент массива: " + minMax[0]);
        System.out.println("Максимальный элемент массива: " + minMax[1]);
    }

    // Метод для поиска минимального и максимального элементов массива
    public static int[] findMinMax(int[] array) {
        if (array.length == 0) {
            return new int[]{0, 0}; // если массив пуст, возвращаем {0, 0}
        }

        // Инициализация минимального и максимального элементов
        int min = array[0];
        int max = array[0];

        // Проход по массиву для поиска минимального и максимального элементов
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        // Возвращение минимального и максимального элементов в виде массива
        return new int[]{min, max};
    }
}

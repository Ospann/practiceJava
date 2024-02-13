package lab3;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Пример массива для сортировки
        int[] array = {9, 3, 7, 2, 8, 5, 4, 6, 1};

        // Вызов метода сортировки
        bubbleSort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив (в порядке возрастания):");
        System.out.println(Arrays.toString(array));
    }

    // Метод для пузырьковой сортировки массива
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Проход по массиву для каждого элемента
        for (int i = 0; i < n - 1; i++) {
            // Внутренний цикл для сравнения и обмена элементов
            for (int j = 0; j < n - i - 1; j++) {
                // Если текущий элемент больше следующего, меняем их местами
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

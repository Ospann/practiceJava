package practice3.part2;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание массива указанного размера
        int[] array = new int[size];

        // Заполнение массива элементами, вводимыми с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Вызов метода сортировки выбором
        selectionSort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    // Метод для сортировки выбором
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Проход по всем элементам массива
        for (int i = 0; i < n - 1; i++) {
            // Предполагаем, что минимальный элемент находится в текущей позиции
            int minIndex = i;

            // Поиск минимального элемента в оставшейся части массива
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Обмен текущего элемента с минимальным элементом
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

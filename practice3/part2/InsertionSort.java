package practice3.part2;
import java.util.Scanner;

public class InsertionSort {
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

        // Вызов метода сортировки вставками
        insertionSort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    // Метод для сортировки вставками
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Проход по всем элементам массива, начиная со второго
        for (int i = 1; i < n; i++) {
            // Текущий элемент, который нужно вставить в отсортированную часть массива
            int key = arr[i];
            int j = i - 1;

            // Перемещение всех элементов больших, чем key, на одну позицию вперед
            // пока не будет найдено место для вставки key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Вставка key в найденное место
            arr[j + 1] = key;
        }
    }
}

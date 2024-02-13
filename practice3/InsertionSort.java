package practice3;

public class InsertionSort {
    public static void main(String[] args) {
        // Входные данные: массив строк
        String[] array = {"a", "v", "b", "s", "r", "f", "k", "l", "o"};

        // Вызов метода сортировки
        insertionSort(array);

        // Вывод отсортированного массива
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    // Метод для сортировки вставками
    public static void insertionSort(String[] arr) {
        int n = arr.length;

        // Проход по всем элементам массива, начиная со второго
        for (int i = 1; i < n; i++) {
            // Текущий элемент, который нужно вставить в отсортированную часть массива
            String key = arr[i];
            int j = i - 1;

            // Перемещение всех элементов больших, чем key, на одну позицию вперед
            // пока не будет найдено место для вставки key
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Вставка key в найденное место
            arr[j + 1] = key;
        }
    }
}

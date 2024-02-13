package lab3;

public class MinMaxElements {
    public static void main(String[] args) {
        // Пример массива
        int[] array = {9, 3, 7, 2, 8, 5, 4, 6, 1, 9};

        // Вызов метода для нахождения наименьшего и наибольшего элементов
        findMinMax(array);
    }

    // Метод для нахождения наименьшего и наибольшего элементов в массиве
    public static void findMinMax(int[] arr) {
        // Инициализация переменных для хранения наименьшего и наибольшего элементов
        int min = arr[0];
        int max = arr[0];

        // Проход по массиву для поиска наименьшего и наибольшего элементов
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Вывод наименьшего элемента
        System.out.println("Наименьший элемент(ы):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.println(min);
            }
        }

        // Вывод наибольшего элемента
        System.out.println("Наибольший элемент(ы):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.println(max);
            }
        }
    }
}

package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание массива для хранения 5 чисел
        int[] numbers = new int[5];

        // Ввод чисел с клавиатуры и запись их в массив
        System.out.println("Введите 5 чисел:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Сортировка массива
        Arrays.sort(numbers);

        // Нахождение медианы
        double median;
        if (numbers.length % 2 == 0) {
            median = (double)(numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            median = numbers[numbers.length / 2];
        }

        // Вывод медианы
        System.out.println("Медиана массива: " + median);

        scanner.close();
    }
}

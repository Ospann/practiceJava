package lab3;
public class ArrayAverage {
    public static void main(String[] args) {
        // Пример массива
        int[] array = {5, 10, 15, 20, 25};

        // Вызов метода для вычисления среднего арифметического
        double average = calculateAverage(array);

        // Вывод результата
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }

    // Метод для вычисления среднего арифметического всех элементов массива
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0; // если массив пуст, среднее арифметическое равно 0
        }

        // Суммирование всех элементов массива
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Вычисление среднего арифметического
        return (double) sum / array.length;
    }
}

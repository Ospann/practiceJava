package lab3;


/**
 * Task 3.3
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        double average = calculateAverage(array);

        System.out.println("Среднее арифметическое элементов массива: " + average);
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0; 
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}

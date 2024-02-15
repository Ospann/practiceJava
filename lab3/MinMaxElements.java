package lab3;

/*
 * Task 1
 */
public class MinMaxElements {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 2, 8, 5, 4, 6, 1, 9};

        findMinMax(array);
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Наименьший элемент(ы):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.println(min);
            }
        }

        System.out.println("Наибольший элемент(ы):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.println(max);
            }
        }
    }
}

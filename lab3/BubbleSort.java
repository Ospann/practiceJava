package lab3;
import java.util.Arrays;

/*
 * Task 3
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 3, 7, 2, 8, 5, 4, 6, 1};

        bubbleSort(array);

        System.out.println("Отсортированный массив (в порядке возрастания):");
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

package practice3;

/**
 * TASK 1 
 * compareTo - сранивает значение и return 0 если они равны, иначе возвращает число
 */
public class SelectionSort {
    public static void main(String[] args) {
        String[] array = {"a", "v", "b", "s", "r", "f", "k", "l", "o"};

        selectionSort(array);

        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    public static void selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

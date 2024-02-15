package practice3;


/**
 * TASK 2 
 * compareTo - сранивает значение и return 0 если они равны, иначе возвращает число
 */
public class InsertionSort {
    public static void main(String[] args) {
        String[] array = {"a", "v", "b", "s", "r", "f", "k", "l", "o"};

        insertionSort(array);

        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
}

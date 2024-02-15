// package lab3;


/**
 * Task 3.3
 */
public class MinMaxEl {
    public static void main(String[] args) {
        int[] array = {5, 10, -3, 8, 15, 20, -7};

        int[] minMax = findMinMax(array);

        System.out.println("Минимальный элемент массива: " + minMax[0]);
        System.out.println("Максимальный элемент массива: " + minMax[1]);
    }

    public static int[] findMinMax(int[] array) {
        if (array.length == 0) {
            return new int[]{0, 0}; 
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[]{min, max};
    }
}

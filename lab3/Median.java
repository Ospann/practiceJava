// package lab3;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Task 2
 */
public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Введите 5 чисел:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        
        int median = numbers[numbers.length / 2];
      
        System.out.println("Медиана массива: " + median);

        scanner.close();
    }
}

// package lab2.part2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #2
 * Description: Напишите программу, которая считывает набор целых чисел с клавиатуры,
 * а затем печатает сумму четных и нечетных целых чисел.
 */
public class EvenOddSum {
    private static final Logger logger = Logger.getLogger(EvenOddSum.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Напиши целочисленные цифры в ряд: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        int evenSum = 0;
        int oddSum = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

       logger.info("Сумма четных: " + evenSum);
       logger.info("Сумма нечетных: " + oddSum);
        scanner.close();
    }
}

// package lab2.part2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #4
 * Description: Напишите программу, которая многократно считывает числа из клавиатуры,
 * пока пользователь не введет «0». После того, как «0» введено, распечатайте общее количество введенных
 * чисел и среднее арифметическое значение введенных числ.
 */
public class NumberInputLoop {
        private static final Logger logger = Logger.getLogger(NumberInputLoop.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCount = 0;
        int sum = 0;

        int num;

        do {
           logger.info("Enter a number (enter 0 to exit): ");
            num = scanner.nextInt();

            sum += num;
            totalCount++;
        } while (num != 0);

        // To avoid division by zero
        double average = (totalCount != 0) ? (double) sum / totalCount : 0;

       logger.info("Total count of numbers: " + totalCount);
       logger.info("Average value: " + average);
       scanner.close();
    }
}

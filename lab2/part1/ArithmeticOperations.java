package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #4
 * Description: Напишите программу на Java, которая принимает от пользователя два целых числа,
 * а затем выводит сумму, разность, произведение, среднее значение, расстояние (разницу между целыми числами),
 * максимум (большее из двух целых чисел), минимум (меньшее из двух целых чисел) двух целых чисел.
 */
public class ArithmeticOperations {
    private static final Logger logger = Logger.getLogger(ArithmeticOperations.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter the first integer: ");
        int num1 = scanner.nextInt();

        logger.info("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(num1 - num2);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        logger.info("Sum: " + sum);
        logger.info("Difference: " + difference);
        logger.info("Product: " + product);
        logger.info("Average: " + average);
        logger.info("Distance: " + distance);
        logger.info("Maximum: " + maximum);
        logger.info("Minimum: " + minimum);
        scanner.close();
    }
}

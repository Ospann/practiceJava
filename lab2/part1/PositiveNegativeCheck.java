// package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #5
 * Description: Напишите программу на Java, чтобы получить число от пользователя и вывести
 * его положительное или отрицательное значение.
 */
public class PositiveNegativeCheck {
    private static final Logger logger = Logger.getLogger(PositiveNegativeCheck.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
           logger.info("Positive");
        } else if (number < 0) {
           logger.info("Negative");
        } else {
           logger.info("Zero");
        }
        scanner.close();
    }
}

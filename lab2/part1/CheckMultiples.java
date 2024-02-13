// package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #3
 * Description: Java-программа для проверки, является ли данное целое число кратным 5 и 7.
 */
public class CheckMultiples {
    private static final Logger logger = Logger.getLogger(CheckMultiples.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter an integer: ");
        int number = scanner.nextInt();

        boolean result = (number % 5 == 0) && (number % 7 == 0);

       logger.info("Result: " + result);
        scanner.close();
    }
}

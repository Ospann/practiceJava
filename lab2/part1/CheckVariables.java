// package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #2
 * Description: Напишите программу на Java, которая принимает две переменные,
 *  и проверяйте, находятся ли они строго между 0 и 1,
 *  если да тогда вывести true и false в противном случае.
 */
public class CheckVariables {
    private static final Logger logger = Logger.getLogger(CheckVariables.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter variable 1: ");
        double var1 = scanner.nextDouble();

       logger.info("Enter variable 2: ");
        double var2 = scanner.nextDouble();

        boolean result = (var1 > 0 && var1 < 1) && (var2 > 0 && var2 < 1);

       logger.info("Result: " + result);
        scanner.close();
    }
}

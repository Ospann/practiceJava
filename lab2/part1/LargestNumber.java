
// package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #6
 * Description: Возьмите у пользователя три числа и выведите наибольшее из них.
 */
public class LargestNumber {
    private static final Logger logger = Logger.getLogger(LargestNumber.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter the first number: ");
        int num1 = scanner.nextInt();

       logger.info("Enter the second number: ");
        int num2 = scanner.nextInt();

       logger.info("Enter the third number: ");
        int num3 = scanner.nextInt();

        int maxNumber = Math.max(Math.max(num1, num2), num3);

       logger.info("Largest number: " + maxNumber);
        scanner.close();
    }
}

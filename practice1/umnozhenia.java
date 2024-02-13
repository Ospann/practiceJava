package practice1;

import java.util.Scanner;
import java.util.logging.Logger;

public class umnozhenia {
      private static final Logger logger = Logger.getLogger(umnozhenia.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        logger.info("Введите первое число:");
        double first = scanner.nextDouble();

        logger.info("Введите второе число:");
        double second = scanner.nextDouble();

        double sum = first * second;

        logger.info("Сумма: " + sum);

        scanner.close();
    }
}

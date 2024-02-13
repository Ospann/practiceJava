package practice1;

import java.util.Scanner;
import java.util.logging.Logger;

public class devideNumbers {
    private static final Logger logger = Logger.getLogger(devideNumbers.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();

        double number2 = scanner.nextDouble();

        double sum = number1 / number2;
        logger.info("result :" + sum);
        scanner.close();
    }
}

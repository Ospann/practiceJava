import java.util.Scanner;
import java.util.logging.Logger;

/**
 * task #4
 * description: Напишите программу Java для преобразования десятичного числа в двоичное
 */
public class DecimalToBinary {
    private static final Logger logger = Logger.getLogger(DecimalToBinary.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Введите десятичное число: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        logger.info("Двоичное представление: " + binary);
        scanner.close();
    }
}

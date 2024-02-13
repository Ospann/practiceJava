// package lab2.part2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #3
 * Description: Напишите цикл do- while, который просит пользователя ввести два числа.
 * Числа следует сложить и отобразить сумму. Цикл должен спросить пользователя,
 * хочет ли он выполнить операцию еще раз. Если это так, цикл должен повториться;
 * в противном случае оно должно прекратиться.
 */
public class DoWhileSum {
    private static final Logger logger = Logger.getLogger(DoWhileSum.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
           logger.info("Введите первое число: ");
            int num1 = scanner.nextInt();

           logger.info("Введите второе число: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

           logger.info("Сумма: " + sum);

           logger.info("Вы хотите продолжить? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));
        scanner.close();
    }
}

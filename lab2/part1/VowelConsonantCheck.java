package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #8
 * Description: Напишите программу на Java, которая требует от пользователя ввода одного символа из алфавита.
 *  Напечатайте гласную или согласную, в зависимости от ввода пользователя.
 *  Если пользовательский ввод не является буквой (между a и z или A и Z) или представляет собой строку длины > 1, выведите сообщение об ошибке.
 */
public class VowelConsonantCheck {
    private static final Logger logger = Logger.getLogger(VowelConsonantCheck.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter a single letter: ");
        char inputChar = scanner.next().charAt(0);

        if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
            switch (inputChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                   logger.info("Гласная");
                    break;
                default:
                   logger.info("Согласная");
            }
        } else {
           logger.info("Ошибка ввода");
        }
        scanner.close();
    }
}

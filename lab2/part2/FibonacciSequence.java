// package lab2.part2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #1
 * Description: Числа Фибоначчи. Числами Фибоначчи называется последовательность натуральных чисел,
 * первые два из которых равны единице, а каждое следующее число в последовательности равняется
 * сумме двух предыдущих.
 * Напрмер: 1 1 2 3 5 8 13 21 34 ….
 */
public class FibonacciSequence {
        private static final Logger logger = Logger.getLogger(FibonacciSequence.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("ВВедите длину: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;

       logger.info("Fibonacci:");

        for (int i = 0; i < n; i++) {
           logger.info(a + " ");
            int temp = a;
            a = b;
            b += temp;
        }

        scanner.close();
    }
}

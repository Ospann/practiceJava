// package practice2;
import java.util.Scanner;
import java.util.logging.Logger;


public class Task2 {
        private static final Logger logger = Logger.getLogger(Task2.class.getName());

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            logger.info("Введите x:");
            double x = scanner.nextDouble();
            logger.info("Введите a:");
            double a = scanner.nextDouble();
            logger.info("Введите b:");
            double b = scanner.nextDouble();
            double y = 0;
            if (x > 0) {
                y = a + 0.5 * Math.exp(-x);
            } else {
                y = Math.cos(b * x + 1); 
            }
            logger.info("result : " + y);
            scanner.close();
        }
}

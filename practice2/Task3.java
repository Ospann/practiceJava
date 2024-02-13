// package practice2;
import java.util.Scanner;
import java.util.logging.Logger;


public class Task3 {
        private static final Logger logger = Logger.getLogger(Task3.class.getName());

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            logger.info("Введите x:");
            double x = scanner.nextDouble();
            logger.info("Введите a:");
            double a = scanner.nextDouble();
            logger.info("Введите b:");
            double b = scanner.nextDouble();
            double y = 0;
            if (x > 1) {
                y = b * Math.log10(x);
            } else {
                y = 1 / (Math.pow(a,2) + Math.pow(x,2) );
            }
            logger.info("result : " + y);
            scanner.close();
        }
}

// package practice2;
import java.util.Scanner;
import java.util.logging.Logger;


public class Task1 {
        private static final Logger logger = Logger.getLogger(Task1.class.getName());

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            logger.info("Введите x:");
            double x = scanner.nextDouble();
            logger.info("Введите a:");
            double a = scanner.nextDouble();
            logger.info("Введите b:");
            double b = scanner.nextDouble();
            double y = 0;
            if (x > 3) {
                y = Math.pow(x,2) / (Math.pow(x,2) + a);
            } else {
                y = b + 2 *(Math.log10(x));  
            }
            logger.info("result : " + y);
            scanner.close();
        }
}

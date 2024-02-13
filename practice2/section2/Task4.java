import java.util.Scanner;
import java.util.logging.Logger;

public class Task4 {
    private static final Logger logger = Logger.getLogger(Task4.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = 0;

        try {
            logger.info("Введите -1 =< x < 1:");
            double x = scanner.nextDouble();
            logger.info("Введите n:");
            int n = scanner.nextInt();
            if (x < -1 && x > 1 || n <= 0) {
                throw new Exception("Invalid number");
            }

            while (n > 0) {
                s += Math.pow(x, (4*n + 1)) / (4*n + 1);
                n--;
            }
            logger.info("result: " +String.valueOf(s));
        } catch (Exception e) {
            logger.warning("Введите нормальное значение");
        }
        scanner.close();
    }
}

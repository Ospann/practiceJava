import java.util.Scanner;
import java.util.logging.Logger;

public class Task2 {
    private static final Logger logger = Logger.getLogger(Task2.class.getName());

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = 0;

        try {
            logger.info("Введите x:");
            double x = scanner.nextDouble();
            logger.info("Введите n:");
            int n = scanner.nextInt();

            while (n > 0) {
                s += Math.pow(-1, n) * (2*n * Math.pow(x, 2*n+1)/factorial(2*n+1));
                n--;
            }

            logger.info("result : " + s);
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
        scanner.close();
    }
}

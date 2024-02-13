import java.util.Scanner; 
import java.util.logging.Logger;

/**
 * Task #2
 * Description : Напишите программу на Java, которая принимает три числа в качестве
 * входных данных для вычисления и вывода среднего числа чисел.
 */
public class CalculateAvgNumber {
  private static final Logger logger = Logger.getLogger(CalculateAvgNumber.class.getName());

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Введите три числа: ");

        if (scanner.hasNextFloat()) {
            float first = scanner.nextFloat();
            float second = scanner.nextFloat();
            float third = scanner.nextFloat();

            float sum = first + second + third;
            float average = sum / 3;

            logger.info("Среднее значение: " + average);
        } else {
          logger.info("Введены некорректные данные, нужен формат float or int");
        }

        scanner.close();
    }
}

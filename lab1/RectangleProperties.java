
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #3
 * description: Напишите программу на Java для вывести на экран площади и периметра прямоугольника.
 */
public class RectangleProperties {
    private static final Logger logger = Logger.getLogger(RectangleProperties.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        logger.info("Введите длину прямоугольника:");
        double length = scanner.nextDouble();

        logger.info("Введите ширину прямоугольника:");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        logger.info("Площадь прямоугольника: " + area);
        logger.info("Периметр прямоугольника: " + perimeter);

        scanner.close();
    }
}

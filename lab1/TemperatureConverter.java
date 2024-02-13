import java.util.Scanner; //утилита которая умееет считывать данные из разных источников: консоль, файлы, интернет. 
import java.util.logging.Logger;

/**
 * Task #1
 * Description: Напишите программу, которая запрашивает у пользователя температуру по Цельсию, 
 * конвертирует температуру в градусы Фаренгейта и распечатывает преобразованную температуру.
 */
public class TemperatureConverter {
    private static final Logger logger = Logger.getLogger(RectangleProperties.class.getName());

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            logger.info("Введите температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = celsius * 9/5 + 32;

            logger.info(celsius + " градусов Цельсия равно " + fahrenheit + " градусов Фаренгейта.");
            scanner.close();
    }
}

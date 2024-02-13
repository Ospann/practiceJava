// package lab2.part1;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Task #7
 * Description: Напишите программу на Java, которая получает число от пользователя,
 * и отображает название дня недели.
 */
public class DayOfWeek {
    private static final Logger logger = Logger.getLogger(DayOfWeek.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       logger.info("Enter a number (1-7) representing the day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
        }

       logger.info("Day of the week: " + dayName);
        scanner.close();
    }
}

package lab3;


/**
 * Task 2.3
 */
public class StartsWithExample {
    public static void main(String[] args) {
        String str = "Dear, John";

        if (str.startsWith("Dear, ")) {
            System.out.println("Строка начинается с подстроки \"Dear, \".");
        } else {
            System.out.println("Строка НЕ начинается с подстроки \"Dear, \".");
        }
    }
}

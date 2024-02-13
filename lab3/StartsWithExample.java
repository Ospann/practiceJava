package lab3;

public class StartsWithExample {
    public static void main(String[] args) {
        // Пример строки
        String str = "Dear, John";

        // Проверка начинается ли строка с подстроки "Dear, "
        if (str.startsWith("Dear, ")) {
            System.out.println("Строка начинается с подстроки \"Dear, \".");
        } else {
            System.out.println("Строка НЕ начинается с подстроки \"Dear, \".");
        }
    }
}

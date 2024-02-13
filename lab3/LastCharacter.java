public class LastCharacter {
    public static void main(String[] args) {
        // Пример строки
        String str = "Hello, World!";

        // Вызов метода для печати последнего символа строки
        printLastCharacter(str);
    }

    // Метод для печати последнего символа строки
    public static void printLastCharacter(String str) {
        // Проверка, что строка не пустая
        if (str != null && !str.isEmpty()) {
            // Получение индекса последнего символа и печать его
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Строка пустая или равна null.");
        }
    }
}

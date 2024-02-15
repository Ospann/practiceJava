
/**
 * Task 2.1
 * charAt берет элемент по индексу
 */
public class LastCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";

        printLastCharacter(str);
    }

    public static void printLastCharacter(String str) {
        if (str != null && !str.isEmpty()) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Строка пустая или равна null.");
        }
    }
}

package lab3;
public class WordCounter {
    public static void main(String[] args) {
        // Пример текста
        String text = "Это пример текста для подсчета количества слов.";

        // Вызов метода для подсчета количества слов
        int wordCount = countWords(text);

        // Вывод результата
        System.out.println("Количество слов в тексте: " + wordCount);
    }

    // Метод для подсчета количества слов в тексте
    public static int countWords(String text) {
        // Разделение текста на слова по пробелам
        String[] words = text.split("\\s+");

        // Возвращение количества слов
        return words.length;
    }
}

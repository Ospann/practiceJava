package lab3;

/**
 * Task 3.1
 */
public class WordCounter {
    public static void main(String[] args) {
        String text = "Это пример текста для подсчета количества слов.";

        int wordCount = countWords(text);

        System.out.println("Количество слов в тексте: " + wordCount);
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");

        return words.length;
    }
}

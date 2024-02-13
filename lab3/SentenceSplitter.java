package lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceSplitter {
    public static void main(String[] args) {
        // Пример текста
        String text = "Это предложение №1. А это предложение №2? И наконец, предложение №3!";

        // Вызов метода для разделения текста на предложения и подсчета их количества
        splitAndCountSentences(text);
    }

    // Метод для разделения текста на предложения и подсчета их количества
    public static void splitAndCountSentences(String text) {
        // Регулярное выражение для поиска предложений (предложение заканчивается на ".", "!" или "?")
        String regex = "[^.!?]+[.!?]";

        // Создание объекта Pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Создание объекта Matcher
        Matcher matcher = pattern.matcher(text);

        // Переменная для хранения количества предложений
        int sentenceCount = 0;

        // Цикл для поиска предложений и их вывода
        while (matcher.find()) {
            // Получение предложения
            String sentence = matcher.group().trim();
            
            // Вывод предложения
            System.out.println("Предложение " + (sentenceCount + 1) + ": " + sentence);

            // Увеличение счетчика предложений
            sentenceCount++;
        }

        // Вывод общего количества предложений
        System.out.println("Общее количество предложений: " + sentenceCount);
    }
}


package lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Task 2.2
 */
public class SentenceSplitter {
    public static void main(String[] args) {
        String text = "Это предложение №1. А это предложение №2? И наконец, предложение №3!";

        splitAndCountSentences(text);
    }

    public static void splitAndCountSentences(String text) {
        String regex = "[^.!?]+[.!?]";

        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(text);

        int sentenceCount = 0;

        while (matcher.find()) {
            String sentence = matcher.group().trim();
            
            System.out.println("Предложение " + (sentenceCount + 1) + ": " + sentence);

            sentenceCount++;
        }

        System.out.println("Общее количество предложений: " + sentenceCount);
    }
}


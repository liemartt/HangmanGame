package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Word {
    private static boolean isCorrect(String word) {
        return word.length() > 4 && word.length() < 11;
    }

    public static List<Character> getWordFromFile() {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("russian_nouns.txt"))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (isCorrect(word))
                    list.add(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int index = 1 + (int) (Math.random() * list.size());
        String word = list.get(index);
        List<Character> chars = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            chars.add(ch);
        }
        return chars;

    }
}

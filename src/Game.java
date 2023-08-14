package src;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Input inputScanner;

    public Game() {
        inputScanner = new Input();
    }

    public void startNewGame() {
        List<Character> word = Word.getWordFromFile();
        List<Character> guessedLetters = new ArrayList<>();
        List<Character> usedLetters = new ArrayList<>();
        for (int i = 0; i < word.size(); i++) {
            guessedLetters.add(' ');
        }
        int mistakesCounter = 0;


        System.out.print("Слово загадано: \n");
        Printer.printWord(guessedLetters, mistakesCounter);
        System.out.println();
        while (mistakesCounter != 7) {
            System.out.println("Использованные буквы: " + usedLetters);
            Character letter = inputScanner.getCharacterFromUser();
            if (usedLetters.contains(letter)) {
                System.out.println("Вы уже вводили эту букву, попробуйте другую");
                continue;
            }
            usedLetters.add(letter);
            if (!word.contains(letter)) {
                System.out.println("Такой буквы не существует в загаданном слове");
                mistakesCounter++;
                Printer.printWord(guessedLetters, mistakesCounter);
                System.out.println("Количество оставшихся попыток: " + (7 - mistakesCounter));
                continue;
            }
            for (int i = 0; i < guessedLetters.size(); i++) {
                if (word.get(i).equals(letter)) {
                    guessedLetters.remove(i);
                    guessedLetters.add(i, letter);
                }
            }
            Printer.printWord(guessedLetters, mistakesCounter);

        }
        if (mistakesCounter < 7) System.out.println("Вы выиграли \uD83E\uDD73");
        else System.out.println("Вы проиграли \uD83D\uDE14\nЗагаданное слово: " + word.toString());
    }
}

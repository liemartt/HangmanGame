package src;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Game(){
        List<Character> guessedLetters = new ArrayList<>();
        List<Character> usedLetters = new ArrayList<>();
        List<Character> word = Word.getWordFromFile();
        for (int i = 0; i < word.size(); i++) {
            guessedLetters.add('a');
        }

        Printer.print(guessedLetters);
        Printer.printStage(7);
    }
}

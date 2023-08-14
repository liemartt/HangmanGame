package src;

import javax.print.attribute.standard.PrinterName;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Input inputScanner = new Input();
    private List<Character> guessedLetters = new ArrayList<>();
    private List<Character> usedLetters = new ArrayList<>();
    private final List<Character> word;
    private int mistakesCounter = 0;
    private int counterOFGuessedLetters = 0;

    public Game(){
        word = Word.getWordFromFile();

        for (int i = 0; i < word.size(); i++) {
            guessedLetters.add(' ');
        }

    }
    public void startNewGame(){
        System.out.print("Слово загадано: \n");
        Printer.print(guessedLetters);
        System.out.println();
        while(mistakesCounter!=7&&counterOFGuessedLetters!=guessedLetters.size()){

            Character letter = inputScanner.getCharacterFromUser();
            if(usedLetters.contains(letter)){
                System.out.println("Вы уже вводили эту букву, попробуйте другую");
                continue;
            }
            usedLetters.add(letter);
            if(!word.contains(letter)){
                System.out.println("Такой буквы не существует в загаданном слове");
                mistakesCounter++;
                Printer.print(guessedLetters);
                Printer.printStage(mistakesCounter);
                System.out.println("Количество оставшихся попыток: "+(7-mistakesCounter));
                continue;
            }
            for (int i = 0; i < guessedLetters.size(); i++) {
                if(word.get(i).equals(letter)){
                    guessedLetters.remove(i);
                    guessedLetters.add(i, letter);
                    counterOFGuessedLetters++;
                }
            }
            Printer.print(guessedLetters);
            Printer.printStage(mistakesCounter);

        }
        if(counterOFGuessedLetters==guessedLetters.size()) System.out.println("Вы выиграли \uD83E\uDD73");
        else System.out.println("Вы проиграли \uD83D\uDE14\nЗагаданное слово: "+word.toString());
    }
}

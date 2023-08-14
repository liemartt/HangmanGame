package src;

import java.util.List;

public class Printer {

    public static void printStage(int stage) {
        System.out.println(Stages.stages[stage]);
    }

    public static void printWord(List<Character> guessedLetters) {
        for (int i = 0; i < guessedLetters.size(); i++) {
            System.out.print("+-+ ");
        }
        System.out.println();
        for (char ch :
                guessedLetters) {
            System.out.print('|');
            System.out.print(Character.toUpperCase(ch));
            System.out.print("| ");
        }
        System.out.println();
        for (int i = 0; i < guessedLetters.size(); i++) {
            System.out.print("+-+ ");
        }
        System.out.println();

    }
}

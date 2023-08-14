package src;

import java.util.List;

public class Printer {

    public static void printStage(int stage){
        System.out.println(Stages.stages[stage]);
        }
    public static void print(List<Character> guessedLetters){
        for(int i = 0;i<guessedLetters.size();i++){
            System.out.print("__");
        }
        System.out.println();
        System.out.print('|');
        for (char ch:
             guessedLetters) {
            System.out.print(Character.toUpperCase(ch));
            System.out.print('|');
        }
        System.out.println();
        for (int i = 0; i < guessedLetters.size(); i++) {
            System.out.print("__");
        }
        System.out.println();

    }
}

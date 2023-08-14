package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static boolean isCorrectLetter(Character letter) {
        String alph = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        List<Character> letters = new ArrayList<>();
        for (char ch : alph.toCharArray()) {
            letters.add(ch);
            letters.add(Character.toLowerCase(ch));
        }
        return letters.contains(letter);
    }

    public Character getCharacterFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите желаемую букву: ");
            String userInput = scanner.next();
            if (userInput.length() != 1) {
                System.out.println("Ошибка, введена не буква, попробуйте заново");
                continue;
            }
            Character letter = userInput.charAt(0);
            if (isCorrectLetter(letter)) {
                return letter;
            } else {
                System.out.println("Ошибка, введена не русская буква, попробуйте заново");
            }
        }
    }

}

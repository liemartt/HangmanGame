package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Выберите действие:\n1. Начать игру\n2. Выход");
            Scanner scanner = new Scanner(System.in);
            int choise = scanner.nextInt();
            if(choise==1){
                new Game().startNewGame();
            }
            else if(choise==2) System.exit(1);
            else System.out.println("Неверный ввод");
        }

    }

}

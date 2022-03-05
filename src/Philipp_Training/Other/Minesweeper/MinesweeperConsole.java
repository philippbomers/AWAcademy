package Philipp_Training.Other.Minesweeper;

import java.util.Scanner;

public class MinesweeperConsole extends MinesweeperBoard {

    Scanner scanner;

    public MinesweeperConsole(int width, int bombs) {
        super(width, bombs);
        this.scanner = new Scanner(System.in);
    }

    public void createBoard() {
        String content;
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.height; col++) {
            System.out.printf("%3d", col);
        }
        System.out.printf("%n");
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.height; col++) {
            System.out.printf("%3s", "___");
        }
        for (int row = 0; row < this.height; row++) {
            System.out.printf("%n%3d", row);
            System.out.printf("%3s", "|");
            for (int col = 0; col < this.width; col++) {
                content = getSign(row, col);
                System.out.printf("%3s", content);
            }
        }
    }

    public void getLoosingDialogue() {
        System.out.println("\nDU HAST VERLOREN");
        System.exit(0);
    }


    public static int getUserInputInteger(String text, int minimum, int maximum) {
        while (true) {
            System.out.println("\n" + text);
            String input = (new Scanner(System.in)).nextLine();
            int userInput = Integer.parseInt(input);
            if (userInput >= minimum && userInput < maximum) {
                return userInput;
            } else {
                System.out.println("Diese Zahl ist nicht möglich.");
            }
        }

    }

    public static boolean getUserInputBoolean(String text) {
        System.out.println("\n" + text);
        String input = (new Scanner(System.in)).nextLine();
        return Boolean.parseBoolean(input);
    }
}

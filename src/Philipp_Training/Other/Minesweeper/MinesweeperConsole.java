package Philipp_Training.Other.Minesweeper;

import java.util.Scanner;

public class MinesweeperConsole extends MinesweeperBoard {

    Scanner scanner;

    public MinesweeperConsole(int width, int bombs) {
        super(width, bombs);
        this.scanner = new Scanner(System.in);

        this.createBoard();

        while (true) {
            int row = MinesweeperConsole.getUserInputInteger("Bitte gib die Reihe ein: ", 0, this.getWidth());
            int col = MinesweeperConsole.getUserInputInteger("Bitte gib die Spalte ein: ", 0, this.getWidth());

            super.setOpenFields(row, col);
            this.createBoard();

            if (super.getOpenFields(row, col)) {
                this.getLoosingDialogue();
            } else if (super.isCompletedFields()) {
                this.getWinningDialogue();
            } else {
                if (MinesweeperConsole.getUserInputBoolean("Möchtest du das Programm beenden? [true][false]")) {
                    System.exit(0);
                }
            }
        }
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

    public void createBoard() {
        String content;
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.getWidth(); col++) {
            System.out.printf("%3d", col);
        }
        System.out.printf("%n");
        System.out.printf("%6s", " ");
        for (int col = 0; col < this.getWidth(); col++) {
            System.out.printf("%3s", "___");
        }
        for (int row = 0; row < this.getWidth(); row++) {
            System.out.printf("%n%3d", row);
            System.out.printf("%3s", "|");
            for (int col = 0; col < getWidth(); col++) {
                content = getSign(row, col);
                System.out.printf("%3s", content);
            }
        }
    }

    public void getLoosingDialogue() {
        System.out.println("\nDU HAST VERLOREN");
        System.exit(0);
    }

    public void getWinningDialogue() {
        System.out.println("\nDU HAST GEWONNEN");
        System.exit(0);
    }
}

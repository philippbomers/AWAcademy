package Philipp_Training.Other.Minesweeper;

import java.util.Scanner;

/**
 * Das Spiel in der Konsole
 */
public class MinesweeperConsoleLogic extends MinesweeperBoardLogic {

    Scanner scanner;

    /**
     * Generiert das Brett auf der Konsole
     *
     * @param width Breite (in Anzahl der Felder)
     * @param bombs Anzahl der Bomben
     */
    public MinesweeperConsoleLogic(int width, int bombs) {
        super(width, bombs);
        this.scanner = new Scanner(System.in);

        this.createBoard();

        while (true) {
            int row = MinesweeperConsoleLogic.parseUserInputInteger("Bitte gib die Reihe ein: ", 0, this.getWidth());
            int col = MinesweeperConsoleLogic.parseUserInputInteger("Bitte gib die Spalte ein: ", 0, this.getWidth());

            super.setOpenField(row, col);
            this.createBoard();

            if (super.isOpenField(row, col)) {
                this.generateLoosingDialog();
            } else if (super.isCompletedFields()) {
                this.generateWinningDialog();
            } else {
                if (MinesweeperConsoleLogic.parseUserInputBoolean("Möchtest du das Programm beenden? [true][false]")) {
                    System.exit(0);
                }
            }
        }
    }

    /**
     * Erstellt und überprüft Benutzereingaben von Zahlen (Integer)
     *
     * @param text    Angezeigter Text
     * @param minimum Minimaler Soll-Wert
     * @param maximum Maximaler Soll-Wert
     * @return Integer-Zahl
     */
    private static int parseUserInputInteger(String text, int minimum, int maximum) {
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

    /**
     * Erstellt und überprüft Benutzereingaben von boolischen Wahrheitswerten
     *
     * @param text Benutzereingabe (true, false)
     * @return boolischer Wahrheitswert (true, false)
     */
    private static boolean parseUserInputBoolean(String text) {
        System.out.println("\n" + text);
        String input = (new Scanner(System.in)).nextLine();
        return Boolean.parseBoolean(input);
    }

    /**
     * Druckt das Brett aus
     */
    private void createBoard() {
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

    /**
     * Wird angezeigt, wenn man verliert
     */
    private void generateLoosingDialog() {
        System.out.println("\nDU HAST VERLOREN");
        System.exit(0);
    }

    /**
     * Wird angezeigt, wenn man gewinnt
     */
    private void generateWinningDialog() {
        System.out.println("\nDU HAST GEWONNEN");
        System.exit(0);
    }
}

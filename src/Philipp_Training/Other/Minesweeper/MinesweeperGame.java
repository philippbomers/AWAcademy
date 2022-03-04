package Philipp_Training.Other.Minesweeper;

import java.util.Scanner;

public class MinesweeperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen beim Minesweeper-Game!");
        System.out.println("Wie hoch und breit soll das Feld sein?");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Wie viele Bomben soll es geben?");
        int bombs = Integer.parseInt(scanner.nextLine());


        MinesweeperBoard minesweeperBoard = new MinesweeperBoard(width, bombs);
        minesweeperBoard.createBoard();

        while (true) {
            System.out.println("\nBitte gib die Reihe ein: ");
            int row = Integer.parseInt(scanner.nextLine());

            System.out.println("Bitte gib die Spalte ein: ");
            int col = Integer.parseInt(scanner.nextLine());

            minesweeperBoard.setOpenFields(row, col);
            minesweeperBoard.createBoard();

            System.out.println("\nMöchtest du das Programm beenden? [Ja] oder [Return]");
            if (scanner.nextLine().equalsIgnoreCase("ja")) {
                return;
            }
        }
    }
}

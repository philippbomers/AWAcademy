package Philipp_Training.Other.Minesweeper;

public class MinesweeperGame {

    /**
     * Startdatei zum Spiel.
     * Kann angepasst werden, um die Oberfläche zu wechseln.
     */
    public static void main(String[] args) {
        // start Swing GUI game
        new MinesweeperConfigDialog();

//        Run game in Console (with restricted functionality):
//        System.out.println("Willkommen beim Minesweeper-Game!");
//        int width = MinesweeperConsole.getUserInputInteger("Wie hoch und breit soll das Brett sein?", 0, 100);
//        int bombs = MinesweeperConsole.getUserInputInteger("wie viele Bomben soll es geben?", 0, (width * width - 2));
//        MinesweeperConsole minesweeperConsole = new MinesweeperConsole(3, 3);
    }
}

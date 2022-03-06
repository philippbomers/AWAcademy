package Philipp_Training.Other.Minesweeper;

public class MinesweeperGame {
    public static void main(String[] args) {
        System.out.println("Willkommen beim Minesweeper-Game!");
//
//        int width = MinesweeperConsole.getUserInputInteger("Wie hoch und breit soll das Brett sein?", 0, 100);
//        int bombs = MinesweeperConsole.getUserInputInteger("wie viele Bomben soll es geben?", 0, (width * width - 2));

        new MinesweeperSwingUI(5, 8);
//        MinesweeperConsole minesweeperConsole = new MinesweeperConsole(8, 13);
    }
}

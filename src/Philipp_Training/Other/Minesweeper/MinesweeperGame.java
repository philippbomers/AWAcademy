package Philipp_Training.Other.Minesweeper;

public class MinesweeperGame {
    public static void main(String[] args) {
        System.out.println("Willkommen beim Minesweeper-Game!");
//
//        int width = MinesweeperConsole.getUserInputInteger("Wie hoch und breit soll das Brett sein?", 0, 100);
//        int bombs = MinesweeperConsole.getUserInputInteger("wie viele Bomben soll es geben?", 0, (width * width - 2));

        MinesweeperSwingUI swingUI = new MinesweeperSwingUI(8,13);


//        MinesweeperConsole minesweeperConsole = new MinesweeperConsole(width, bombs);
//        minesweeperConsole.createBoard();
//
//        while (true) {
//            int row = MinesweeperConsole.getUserInputInteger("Bitte gib die Reihe ein: ", 0, minesweeperConsole.getHeight());
//            int col = MinesweeperConsole.getUserInputInteger("Bitte gib die Spalte ein: ", 0, minesweeperConsole.getWidth());
//
//            minesweeperConsole.setOpenFields(row, col);
//            minesweeperConsole.createBoard();
//
//            if (!minesweeperConsole.isCompletedFields()) {
//                if (MinesweeperConsole.getUserInputBoolean("Möchtest du das Programm beenden? [true][false]")) {
//                    System.exit(0);
//                }
//            } else {
//                minesweeperConsole.getLoosingDialogue();
//            }
//        }
    }
}

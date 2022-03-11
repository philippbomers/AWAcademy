package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessBoard;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessField;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import java.util.Objects;
import java.util.Scanner;

public class ChessConsole {

    private final ChessBoard chessBoard;
    private int king;

    public ChessConsole() {
        this.chessBoard = new ChessBoard();

        while (true){
            this.king = 0;
            this.generateConsoleChessBoard();
            if (king == 1) {
                this.generateConsoleWinningDialog();
                return;
            }
            generateConsoleMovePieceDialog();
        }
    }

    private void generateConsoleWinningDialog(){
        System.out.println("\nDu hast gewonnen!");
    }

    private void generateConsoleChessBoard(){
        System.out.printf("%10s", "");
        for (int n = 0; n < 8; n++) {
            System.out.printf("%10s", ChessField.getLetter(n));
        }
        System.out.printf("%n%10s", "");
        for (int n = 0; n < 8; n++) {
            System.out.printf("%10s", "________");
        }

        for (int y = 0; y < 8; y++) {
            System.out.printf("%n%10s", (y+1) + " | ");
            for (int x = 0; x < 8; x++) {
                if (chessBoard.getField(x, y).getChessPiece() != null) {
                    if(!chessBoard.getField(x, y).getChessPiece().isWhite()){
                        System.out.printf("%10s", chessBoard.getField(x, y).getChessPiece().getName().toLowerCase());
                    }else{
                        System.out.printf("%10s", chessBoard.getField(x, y).getChessPiece().getName().toUpperCase());
                    }
                    if(Objects.equals(chessBoard.getField(x, y).getChessPiece().getName(), King.CHESS_PIECE_KING_NAME)){
                        king++;
                    }
                } else {
                    System.out.printf("%10s", chessBoard.getField(x, y).getName());
                }
            }
        }
    }

    private void generateConsoleMovePieceDialog(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\nVon X (A-F):");
            char fromInputX = scanner.nextLine().charAt(0);
            int numFromInputX = ChessField.getNumber(fromInputX);

            System.out.println("Von Y (1-8):");
            int fromInputY = Integer.parseInt(scanner.nextLine())-1;

            System.out.println("Auf X:");
            char toInputX = scanner.nextLine().charAt(0);
            int numToInputX = ChessField.getNumber(toInputX);

            System.out.println("Auf Y:");
            int toInputY = Integer.parseInt(scanner.nextLine())-1;

            if(!this.movePieceOnBoard(numFromInputX, fromInputY, numToInputX, toInputY)){
                this.generateConsoleInputInvalidDialog();
            }
        }catch (Exception e) {
            this.generateConsoleInputInvalidDialog();
            this.generateConsoleMovePieceDialog();
        }

    }

    private void generateConsoleInputInvalidDialog(){
        System.out.println("Eingabe nicht möglich.");
    }

    private boolean movePieceOnBoard(int numFromInputX, int fromInputY, int numToInputX, int toInputY){
        ChessField actualField = this.chessBoard.getField(numFromInputX, fromInputY);
        ChessField newField = this.chessBoard.getField(numToInputX, toInputY);

        if((actualField.getChessPiece() != null) &&
                (newField.getChessPiece() == null ||
                        actualField.getChessPiece().isWhite() != newField.getChessPiece().isWhite()) &&
                (actualField.getChessPiece().move(numToInputX, toInputY))){
            newField.setChessPiece(actualField.getChessPiece());
            actualField.setChessPiece(null);
            return true;
        }
        return false;
    }
}

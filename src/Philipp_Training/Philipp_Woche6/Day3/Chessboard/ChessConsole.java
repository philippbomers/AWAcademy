package Philipp_Training.Philipp_Woche6.Day3.Chessboard;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board.ChessField;
import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.*;

import java.util.Objects;
import java.util.Scanner;

public class ChessConsole {


    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        while (true){
            int king = 0;
            System.out.printf("%10s", "");
            for (int n = 0; n < 8; n++) {
                System.out.printf("%10s", ChessField.getLetter(n));
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
            if (king == 1) {
                System.out.println("\nDu hast gewonnen!");
                return;
            }
            movePieceDialog(chessBoard);
        }
    }

    private static void movePieceDialog(ChessBoard chessBoard){
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

        ChessField actualField = chessBoard.getField(numFromInputX, fromInputY);
        ChessField newField = chessBoard.getField(numToInputX, toInputY);

        if((actualField.getChessPiece() != null) &&
                (newField.getChessPiece() == null ||
                actualField.getChessPiece().isWhite() != newField.getChessPiece().isWhite()) &&
                        (actualField.getChessPiece().move(numToInputX, toInputY))){
            newField.setChessPiece(actualField.getChessPiece());
            actualField.setChessPiece(null);
        }

    }
}

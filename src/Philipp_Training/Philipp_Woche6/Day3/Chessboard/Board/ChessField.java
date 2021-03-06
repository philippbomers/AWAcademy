package Philipp_Training.Philipp_Woche6.Day3.Chessboard.Board;

import Philipp_Training.Philipp_Woche6.Day3.Chessboard.Piece.ChessPiece;

/**
 * Generiert ein Schachfeld
 * - x kann über A-H definiert werden oder über 1-6
 * - y wird über 1-6 definiert
 * - Figuren können sich in einem Feld befinden
 * - Der Name des Feldes lautet X(Buchstabe)Y
 */
public class ChessField {
    final private String name;
    final private int x;
    final private int y;
    private ChessPiece chessPiece;

    public ChessField(char x, int y) {
        this.x = getNumber(x);
        this.y = y;
        int fieldNumberY = y + 1;
        this.name = x + "" + fieldNumberY;
    }

    public ChessField(int x, int y) {
        this.x = x;
        this.y = y;
        int fieldNumberY = y + 1;
        this.name = getLetter(x) + "" + fieldNumberY;
    }

    public static char getLetter(int number) {
        return switch (number) {
            case 0 -> 'A';
            case 1 -> 'B';
            case 2 -> 'C';
            case 3 -> 'D';
            case 4 -> 'E';
            case 5 -> 'F';
            case 6 -> 'G';
            default -> 'H';
        };
    }

    public static int getNumber(char letter) {
        return switch (Character.toUpperCase(letter)) {
            case 'A' -> 0;
            case 'B' -> 1;
            case 'C' -> 2;
            case 'D' -> 3;
            case 'E' -> 4;
            case 'F' -> 5;
            case 'G' -> 6;
            default -> 7;
        };
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ChessPiece getChessPiece() {
        return this.chessPiece;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }
}
